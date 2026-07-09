class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] c = my_string.toCharArray();
        char temp = c[num1];
        c[num1] = c[num2];
        c[num2] = temp;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            sb.append(c[i]);
        }
        
        
        return sb.toString();
    }
}