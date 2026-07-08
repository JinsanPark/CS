class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0){
            int a = order % 10;
            order /= 10;
            if( a != 0 && a % 3 == 0){
                answer++;
            }
        }
        
        return answer;
    }
}