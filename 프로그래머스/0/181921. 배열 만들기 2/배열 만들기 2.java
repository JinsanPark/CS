import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        
    
        int[] answer = new int[127];
        int idx = 0;
        
        for (int i = 1; i < 2 << 7; i++) {
            
            int pv = 1;
            int result = 0;
            int bi = i;
            
            while(bi > 0) {
                if((bi & 1) == 1) {
                    result += 5 * pv;
                    bi >>= 1;
                    pv *= 10;
                } else {
                    bi >>= 1;
                    pv *= 10;
                };       
            };
            
            if(l <= result && result <= r) {
                answer[idx] = result;
                idx++;
            } 
            
        }
        
        if(idx == 0) {
            answer[idx] = -1;
            answer = Arrays.copyOf(answer, idx + 1);
        } else {
            answer = Arrays.copyOf(answer, idx);
        }
            
        
        return answer;
    }
}