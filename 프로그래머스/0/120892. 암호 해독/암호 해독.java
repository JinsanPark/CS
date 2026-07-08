class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] c = cipher.toCharArray();
        
        for(int i = code - 1; i < c.length; i += code){
            sb.append(c[i]);
        }
        
        return sb.toString();
    }
}