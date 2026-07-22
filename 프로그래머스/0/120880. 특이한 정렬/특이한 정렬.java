class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int idx = 0;
        
        for(int i = 0; i <= 9999; i++){
            
            for(int j = 0; j < numlist.length; j++){
              if(n + i == numlist[j]){
                  answer[idx++] = numlist[j];
                  break;
              }
            }
            
            if(i != 0){
                for(int j = 0; j < numlist.length; j++){
                    if(n - i == numlist[j]){
                        answer[idx++] = numlist[j];
                        break;
                    }
                }                
            }
            
            if(idx == numlist.length){
                break;
            }
            
        }
        
        return answer;
    }
}