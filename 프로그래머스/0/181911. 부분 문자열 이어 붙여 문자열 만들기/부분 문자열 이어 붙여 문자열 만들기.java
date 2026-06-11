class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            char[] c = my_strings[i].toCharArray();
            
            for (int j = s; j <= e; j++) {
                sb.append(c[j]);
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}