import java.util.*;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        set.add(n);
        
        for(int i = 0; i < array.length; i++){
            if(n == array[i] && !set.add(array[i])){
                answer++;
            }
        }
        return answer;
    }
}