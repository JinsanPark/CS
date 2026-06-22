import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        
        String[] str = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String s : str) {
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        Collections.sort(list);
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}