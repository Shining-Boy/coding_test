package INTERSACTION_ALGORITHM;

public class Main {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[][] param = {{2,-1,4},{-2,-1,4},{0,-1,1},{5,-8,-12},{5,8,12}};
        String[] result = sol.solution(param);
    
        for(String line : result){
            System.out.println(line);
        }
    }


}
