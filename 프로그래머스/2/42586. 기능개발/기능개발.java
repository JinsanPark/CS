import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        List<Integer> listP = new ArrayList<>();
        List<Integer> listS = new ArrayList<>();
         
        for(int i = 0; i < progresses.length; i++){
            listP.add(progresses[i]);
            listS.add(speeds[i]);
        }
        
        while(!listP.isEmpty()){
            for(int i = 0; i < listP.size(); i++){
                listP.set(i, listP.get(i) + listS.get(i));
            }
            
            int count = 0;
            while(!listP.isEmpty() && listP.get(0) >= 100){
                listP.remove(0);
                listS.remove(0);
                count++;
            }
            
            if(count != 0){
                result.add(count);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}