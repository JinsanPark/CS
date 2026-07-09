import java.util.*;

class Solution {
    public String solution(String s) {

        char[] c = s.toCharArray();
        int[] a = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            a[c[i] - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(a[i] == 1){
                sb.append((char) (i + 'a'));   
            }
        }
     
        return sb.toString();
    }
}