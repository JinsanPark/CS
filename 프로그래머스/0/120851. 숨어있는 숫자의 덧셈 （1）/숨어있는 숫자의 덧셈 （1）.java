class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(Character.isDigit(c[i])){
                answer += c[i] - '0';
            }
        }
        
        return answer;
    }
}