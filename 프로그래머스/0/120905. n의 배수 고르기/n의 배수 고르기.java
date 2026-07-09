class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int len = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                len++;
            }
        }
        
        int[] answer = new int[len];
        int idx = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[idx++] = numlist[i];
            }    
        }
        
        return answer;
    }
}