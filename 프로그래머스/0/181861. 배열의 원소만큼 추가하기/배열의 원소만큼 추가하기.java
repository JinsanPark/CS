class Solution {
    public int[] solution(int[] arr) {
        
        int len = 0;
        
        for (int i : arr) {
            len += i;
        }
        
        int[] answer = new int[len];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            
            while(count != arr[i]) {
                answer[idx] = arr[i];
                idx++;
                count++;
            }
        }
        
        return answer;
    }
}