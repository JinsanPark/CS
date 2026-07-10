class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            int a = array[i];
            
            while(a > 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        
        return answer;
    }
}