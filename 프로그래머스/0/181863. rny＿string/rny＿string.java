class Solution {
    public String solution(String rny_string) {
        
        StringBuilder sb = new StringBuilder();
        char[] c = rny_string.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] == 'm') {
                sb.append('r').append('n');
            } else {
                sb.append(c[i]);
            }
        }
        
        return sb.toString();
    }
}