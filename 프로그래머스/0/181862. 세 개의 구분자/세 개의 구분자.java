import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replace("b","a");
        myStr = myStr.replace("c","a");
        String[] str = myStr.split("a");
        List<String> list = new ArrayList<>();
        
        for (String s : str) {
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        if(list.isEmpty()){
            return new String[]{"EMPTY"};
        } else {
            String[] answer = list.toArray(new String[0]);
            return answer;
        }

    }
}