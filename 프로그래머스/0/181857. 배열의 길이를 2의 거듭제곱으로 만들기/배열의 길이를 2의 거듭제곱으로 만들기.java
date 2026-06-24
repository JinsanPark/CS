class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        int bi = 1;

        while(bi < len) {
            bi <<= 1;
        }
        
        int[] answer = new int[bi];
        
        for(int i = 0; i < bi; i++) {
            if(i < len) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}