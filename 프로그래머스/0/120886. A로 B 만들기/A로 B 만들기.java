import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] c1 = before.toCharArray();
        char[] c2 = after.toCharArray();
        int[] list = new int[26];
        
        for(int i = 0; i < c1.length; i++){
            list[c1[i] - 'a']++;
            list[c2[i] - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(list[i] != 0){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}