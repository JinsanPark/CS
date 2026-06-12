import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length();) {
            String str = my_string.substring(i, i + m);
            sb.append(str.charAt(c - 1));
            i += m;
        }
        
        String answer = sb.toString();
        return answer;
    }
}