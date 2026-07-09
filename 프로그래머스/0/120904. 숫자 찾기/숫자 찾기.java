class Solution {
    public int solution(int num, int k) {

        char[] c = String.valueOf(num).toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] == k + '0'){
                return (i + 1);
            }
        }
        
        return -1;
    }
}