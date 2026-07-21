class Solution {
    public int solution(int a, int b) {
        int gcd = 0;
        
        for(int i = 1000; i >= 2; i--){
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }
        
        if(gcd != 0){
            b /= gcd;
        } 
        
        while(b % 2 == 0 || b % 5 == 0){
            if(b % 2 == 0){
                b /= 2;
            } else {
                b /= 5;
            }
        }
        
        if(b == 1){
            return 1;
        }
        
        return 2;

    }
}