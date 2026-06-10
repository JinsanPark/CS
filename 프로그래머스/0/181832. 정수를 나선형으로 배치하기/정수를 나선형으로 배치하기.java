class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int row = 0;
        int col = 0;
        int d = 0;

        for(int i = 1; i <= n*n; i++) {

            answer[row][col] = i;

            if(0 <= row + direction[d][0] && row + direction[d][0] < n && 0 <= col + direction[d][1] && col + direction[d][1] < n && answer[row + direction[d][0]][col + direction[d][1]] == 0) {
                row = row + direction[d][0];
                col = col + direction[d][1];
            } else {
                d = (d + 1) % 4;
                row = row + direction[d][0];
                col = col + direction[d][1];
            }    
        }

        return answer;
    }
}