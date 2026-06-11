import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length;) {
            
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else {
                list.remove(list.size() - 1);
            }
            
        }        

        int[] stk = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }
        
        return stk;
    }
}