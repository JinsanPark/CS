import java.util.*;

class Solution {
    public String solution(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            map.put(c[i], map.getOrDefault(c[i], 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> i : map.entrySet()){
            if(i.getValue() == 1){
                sb.append(i.getKey());
            }
        }
        
        return sb.toString();
    }
}