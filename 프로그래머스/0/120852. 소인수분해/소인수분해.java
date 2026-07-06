import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        TreeSet<Integer> set = new TreeSet<>();
        int a = 2;
        
        while(a <= n){
            if(n % a == 0){
                set.add(a);
                n /= a;
            } else {
                a++;
            }
        }
        
        int[] answer = new int[set.size()];
        int idx = 0;
        
        for(int i : set){
            answer[idx++] = i;
        }
        
        return answer;
    }
}