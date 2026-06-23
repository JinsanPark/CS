import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        Deque<Integer> queue = new ArrayDeque();

        for (int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2 ; j++){
                    queue.offer(arr[i]);
                }   
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    queue.pollLast();
                }
            }
        }
        
        int[] answer = queue.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}