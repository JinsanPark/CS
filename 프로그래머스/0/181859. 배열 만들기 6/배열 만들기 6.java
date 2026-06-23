import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        if(stack.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[stack.size()];
        int idx = answer.length - 1;
        
        while(!stack.isEmpty()) {
            answer[idx--] = stack.pop();
        }
        
        return answer;
    }
}