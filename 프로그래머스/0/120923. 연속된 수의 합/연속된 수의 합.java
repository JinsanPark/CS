class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        
        for(int i = 0; i < num; i++){
            answer[i] = i;
            sum += i;
        }
        
        while(total != sum){
            
            if(sum > total){
                sum = 0;
                for(int i = 0; i < num; i++){
                    answer[i]--;
                    sum += answer[i];
                }
            } else {
                sum = 0;
                for(int i = 0; i < num; i++){

                    answer[i]++;
                    sum += answer[i];
                }
            }
        }
        
        return answer;
    }
}