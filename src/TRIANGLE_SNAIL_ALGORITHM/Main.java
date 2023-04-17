package TRIANGLE_SNAIL_ALGORITHM;

public class Main {
    public static void main(String[] args) throws Exception {
        Solution sol = new Solution();
        int[] result = sol.solution(5);

        for(int i=0; i<result.length-1; i++){
            System.out.print(result[i]);
            System.out.print(", ");
        }
        System.out.println(result[result.length-1]);
    }
}
