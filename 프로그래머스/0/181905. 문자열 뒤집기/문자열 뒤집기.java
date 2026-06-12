class Solution {
    public String solution(String my_string, int s, int e) {
        
        char[] c = my_string.toCharArray();
        
        while (s < e) {
            
            char temp = c[s];
            c[s] = c[e];
            c[e] = temp;
            s++;
            e--;
            
        }
        
        
        String answer = new String(c);
        return answer;
    }
}