package TRIANGLE_SNAIL_ALGORITHM;

public class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n){
        int[][] triangle = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                triangle[i][j] = 0;
            }
        }
        int v = 1;
        int x = 0;
        int y = 0;
        int d = 0;

        while(true){
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny==n || nx==n || triangle[ny][nx]!=0){
                d = (d+1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                
                if(triangle[ny][nx]!=0){
                    break;
                }
            }
            x = nx;
            y = ny;
        }

        int[] result = new int[v-1];
        int idx = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                result[idx] = triangle[i][j];
                idx++;
            }
        }

        return result;
    }
}
