class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int[][] mapSize = new int[2][2];
        mapSize[0][0] = board[0] / 2;
        mapSize[0][1] = -(board[0]/2);
        mapSize[1][0] = (board[1]/2);
        mapSize[1][1] = -(board[1]/2);
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left") && mapSize[0][1] < answer[0]){
                answer[0]--;
            } else if(keyinput[i].equals("right") && mapSize[0][0] > answer[0]){
                answer[0]++;
            } else if(keyinput[i].equals("up") && mapSize[1][0] > answer[1]){
                answer[1]++;
            } else if(keyinput[i].equals("down") && mapSize[1][1] < answer[1]){
                answer[1]--;
            }
        }
        
        return answer;
    }
}