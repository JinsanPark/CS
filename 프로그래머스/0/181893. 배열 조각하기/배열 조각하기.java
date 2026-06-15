import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++) {
            ad.addLast(arr[i]);
        }
        
        for (int i = 0; i < query.length; i++) {
            int count = ad.size() - query[i] - 1;
            if(i % 2 == 0) {
                for (int j = 0; j < count; j++) {
                    ad.pollLast();
                }
            } else {
                for (int j = 0; j < query[i] ; j++){
                   ad.pollFirst(); 
                }    
            }
        }
        
        int[] answer = new int[ad.size()];
        int i = 0;
        while(!ad.isEmpty()){
            answer[i++] = ad.pollFirst();
        }
        
        return answer;
    }
}