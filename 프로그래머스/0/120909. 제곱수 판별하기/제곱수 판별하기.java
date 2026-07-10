class Solution {
    public int solution(int n) {
        int sq = 1;
        int answer = 2;
        
        while(sq <= n){
            if(sq * sq == n){
                answer = 1;
                break;
            }
            sq++;
        }
        
        return answer;
    }
}