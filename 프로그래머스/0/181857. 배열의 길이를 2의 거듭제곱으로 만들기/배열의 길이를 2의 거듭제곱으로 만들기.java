class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        int bi = 1;

        while(bi < len) {
            bi <<= 1;
        }
        
        int[] answer = new int[bi];
        
        for(int i = 0; i < len; i++) {
                answer[i] = arr[i];
        }
        
        return answer;
    }
}