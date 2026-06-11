class Solution {
    public String solution(String my_string, int[] index_list) {
        
        StringBuilder sb = new StringBuilder();
        char[] line = my_string.toCharArray();
        
        for(int i = 0; i < index_list.length; i++) {
            
            sb.append(line[index_list[i]]);
            
        }
        
        String answer = sb.toString();
        return answer;
    }
}