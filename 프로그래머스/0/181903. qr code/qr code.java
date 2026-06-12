class Solution {
    public String solution(int q, int r, String code) {
        
        StringBuilder sb = new StringBuilder();
        char[] c = code.toCharArray();
        
        for (int i = r; i < c.length;) {
                sb.append(c[i]);
                i += q;
            }
        
        String answer = sb.toString();
        return answer;
    }
}