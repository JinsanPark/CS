class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        int j = n;
        
        while(i <= j){
            
            i++;
            j = n / i;
        
            if(i * j == n && i <= j) {
                answer++;
            } 

            if(i == j && i * j == n){
                return answer = (answer * 2) - 1;
            }            

        }
        
        answer = answer * 2;
        return answer;
    }
}