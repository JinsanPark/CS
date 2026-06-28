import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> delete = new HashSet<>();
        
        for(int i : arr){
            list.add(i);
        }
        
        for(int i : delete_list){
            delete.add(i);
        }
        
        list.removeAll(delete);
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}