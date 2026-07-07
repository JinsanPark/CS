import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        Set<Character> set = new LinkedHashSet<>();
        char[] c = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            set.add(c[i]);
        }
        
        for(char i : set){
            sb.append(i);
        }

        return sb.toString();
    }
}