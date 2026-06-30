class Solution {
    public String solution(String myString) {
        
        char[] c = myString.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] < 'l'){
                c[i] = 'l';
            }
        }
    
        return String.valueOf(c);
    }
}