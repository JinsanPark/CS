class Solution {
    public int solution(int n) {
        int a = n / 7;
        int b = n % 7;
        
        if(b > 0) {
            a += 1;
        }
        
        return a;
    }
}