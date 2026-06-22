class Solution {
    public int solution(String myString, String pat) {
        
        char[] c = myString.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'A') {
                c[i] = 'B';
            } else {
                c[i] = 'A';
            }
        }
        
        String str = new String(c);
    
        return str.contains(pat) ? 1 : 0;
    }
}