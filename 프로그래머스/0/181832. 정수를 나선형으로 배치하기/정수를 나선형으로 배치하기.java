class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int curRow = 0;
        int curCol = 0;
        int d = 0;
        int nextRow = curRow;
        int nextCol = curCol;

        for(int i = 1; i <= n*n;) {
            if(0 <= nextRow && nextRow < n && 0 <= nextCol && nextCol < n && answer[nextRow][nextCol] == 0) {
                answer[nextRow][nextCol] = i;
                curRow = nextRow;
                curCol = nextCol;
                nextRow = curRow + direction[d][0];
                nextCol = curCol + direction[d][1];
                i++;
            } else {
                d = (d + 1) % 4;
                nextRow = curRow + direction[d][0];
                nextCol = curCol + direction[d][1];
            }    
        }

        return answer;
    }
}
