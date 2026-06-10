class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        int startIdx = 0;
        int endIdx = 0;
        int k = 0;
        
        for (int i = 0; i < queries.length; i++) {
            
            startIdx = queries[i][0];
            endIdx = queries[i][1];
            k = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for (int x = startIdx; x <= endIdx; x++) {
                if (arr[x] > k && arr[x] < min) {
                    min = arr[x];
                }
            }
            
            if(min != Integer.MAX_VALUE) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }
        
        }
        
        return answer;
    }
}