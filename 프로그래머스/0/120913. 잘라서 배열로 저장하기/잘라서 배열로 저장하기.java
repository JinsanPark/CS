class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        char[] c = my_str.toCharArray();
        StringBuilder sb;
        String[] answer;
        
        answer = len % n == 0 ? new String[len / n] : new String[(len / n) + 1];
        
        
        for(int i = 0; i < answer.length; i++){
            sb = new StringBuilder();
            for(int j = n * i; j < n * i + n && j < c.length; j++){
                sb.append(c[j]);
            }
        
            answer[i] = sb.toString();
        }
         
        return answer;
    }
}