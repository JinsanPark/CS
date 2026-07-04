import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] mose = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        StringBuilder sb = new StringBuilder();
        String[] sp = letter.split(" ");
        HashMap<String, Character> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            map.put(mose[i], (char) ('a' + i));
        }
        
        for(int i = 0; i < sp.length; i++){
            sb.append(map.get(sp[i]));
        }
        
        return sb.toString();
    }
}