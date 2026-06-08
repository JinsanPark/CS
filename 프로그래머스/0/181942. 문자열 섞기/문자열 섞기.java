class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            sb.append(a[i]).append(b[i]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}