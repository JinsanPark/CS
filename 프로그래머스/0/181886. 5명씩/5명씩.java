class Solution {
    public String[] solution(String[] names) {
        
        int len = names.length;
        String[] answer;
        
        if(len % 5 == 0) {
            answer = new String[len / 5];
        } else {
            answer = new String[(len / 5) + 1];
        }
        
        int idx = 0;
        
        for(int i = 0; i < len; i += 5) {
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}