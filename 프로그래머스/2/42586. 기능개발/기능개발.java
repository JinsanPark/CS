import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length;){
            
            int cur = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            int count = 1;
            
            for(int j = i + 1; j < progresses.length; j++){
                int next = (100 - progresses[j] + speeds[j] - 1) / speeds[j];
                if(cur < next){
                    break;
                } else {
                    count++;
                }
            }
            
            if(count != 0){
                list.add(count);
            }
            
            i += count;
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            
            answer[i] = list.get(i);
            
        }
        
        return answer;
    }
}