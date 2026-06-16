class Solution {
    public String[] solution(String[] str_list) {

        int idx = -1;
        int len = str_list.length;
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                break;
            }
        }
        
        int start = 0;
        int end = 0;

        if (idx == -1) {
            return new String[0];
        } else if (str_list[idx].equals("l")) {
            start = 0;
            end = idx;
        } else {
            start = idx + 1;
            end = len;
        }
        
        String[] answer = new String[end - start];
        int x = 0;
        
        for(int i = start; i < end; i++){
            answer[x++] = str_list[i];
        }
        
        return answer;
        
    }
}