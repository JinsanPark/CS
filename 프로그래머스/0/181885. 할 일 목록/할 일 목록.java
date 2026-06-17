class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int falseCount = 0;
        
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                falseCount++;
            }
        }
        
        String[] answer = new String[falseCount];
        int idx = 0;
            
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]){
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}