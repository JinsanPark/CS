class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int answer = 0;

        String[] line = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            line[i] = my_string.substring(i);
            
            if(line[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
            
        }
               
        return answer;
    }
}