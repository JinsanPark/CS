class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = arr;

        for(int i = 0; i < queries.length; i++) {
            
            int startIdx = queries[i][0];
            int endIdx = queries[i][1];
            int k = queries[i][2];
            
            for (int x = startIdx; x <= endIdx; x++){
                if(x % k == 0) {
                    answer[x]++;
                }
            }
            
        }
    
        return answer;
    }
}