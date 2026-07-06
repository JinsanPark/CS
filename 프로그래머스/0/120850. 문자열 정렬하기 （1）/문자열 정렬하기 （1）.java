import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        int len = 0;
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if( !(c[i] - 97 >= 0)) {
                len++;
            }
        }
        
        int[] answer = new int[len];
        int idx = 0;
        
        for(int i = 0; i < c.length; i++){
            if( !(c[i] - 97 >= 0)) {
                answer[idx++] =  c[i] -'0';
            }        
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}