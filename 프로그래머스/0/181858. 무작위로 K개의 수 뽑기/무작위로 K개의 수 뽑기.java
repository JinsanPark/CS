import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> check = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            if(check.add(arr[i])) {
                stack.push(arr[i]);
            } 
               
            if(stack.size() == k) {
                break;
            }
        }
        
        while(stack.size() != k) {
            stack.push(-1);
        }
        
        int[] answer = new int[k];
        k--;
        
        while(!stack.isEmpty()){
            answer[k--] = stack.pop();
        }
        
        return answer;
    }
}