class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] >= 97) {
                sb.append((char) (c[i] - 32));
            } else {
                sb.append((char) (c[i] + 32));
            }
        }
        
        return sb.toString();
    }
}