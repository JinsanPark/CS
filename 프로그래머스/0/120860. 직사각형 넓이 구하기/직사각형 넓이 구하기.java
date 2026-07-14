class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 1; i < 4; i++){
            
            if(a * b != 0){
                answer = a * b;
                break;
            }
            
            if(dots[0][0] != dots[i][0]){
                a = Math.abs(dots[0][0] - dots[i][0]);
            }
            
            if(dots[0][1] != dots[i][1]){
                b = Math.abs(dots[0][1] - dots[i][1]);
            }
            
        }
        
        return answer;
    }
}