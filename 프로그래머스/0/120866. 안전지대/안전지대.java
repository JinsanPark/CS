class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[] dx = {-1, 0, 1,-1, 1,-1 ,0, 1};
        int[] dy = {-1,-1,-1, 0, 0, 1, 1, 1};
        
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(board[j][i] == 1){
                    for(int k = 0; k < 8; k++){
                        if(i + dx[k] >= 0 && j + dy[k] >= 0 && i + dx[k] < len && j + dy[k] < len && board[j + dy[k]][i + dx[k]] != 1){
                            board[j + dy[k]][i + dx[k]] = -1;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(board[j][i] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}