import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            } else if (stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        int idx = stack.size() - 1;;
        
        while(!stack.isEmpty()){
            answer[idx--] = stack.pop();
        }
    
        return answer;
    }
}