class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int temp = 0;
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++) {
            
            int a = queries[i][0];
            int b = queries[i][1];
            
            temp = answer[a];
            answer[a] = answer[b];
            answer[b] = temp;
        }
        
        
        return answer;
    }
}