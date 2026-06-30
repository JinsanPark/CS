class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length;
        int col = arr[0].length;
        int[][] answer;
        
        if(row > col) {
            answer = new int[row][row];   
        } else if (row < col){
            answer = new int[col][col];
        } else {
            return arr;
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}