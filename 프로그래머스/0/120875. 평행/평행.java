class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
    
            int dx12 = dots[0][0] - dots[1][0];
            int dx13 = dots[0][0] - dots[2][0];
            int dx14 = dots[0][0] - dots[3][0];
            int dy12 = dots[0][1] - dots[1][1];
            int dy13 = dots[0][1] - dots[2][1];
            int dy14 = dots[0][1] - dots[3][1];
            int dx23 = dots[1][0] - dots[2][0];
            int dx24 = dots[1][0] - dots[3][0];
            int dx34 = dots[2][0] - dots[3][0];
            int dy23 = dots[1][1] - dots[2][1];
            int dy24 = dots[1][1] - dots[3][1];
            int dy34 = dots[2][1] - dots[3][1];
            
            if(dx12 * dy34 == dx34 * dy12 || dx13 * dy24 == dx24 * dy13 ||
               dx14 * dy23 == dx23 * dy14) {
                answer = 1;
            }
        
        return answer;
    }
}