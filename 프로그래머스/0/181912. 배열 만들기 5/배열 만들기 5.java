import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int[] answer = new int[intStrs.length];
        int j = 0;
        for (int i = 0; i < intStrs.length; i++) {
            
            String a = intStrs[i].substring(s, s + l);
            int b = Integer.parseInt(a);
        
            if(b > k) {
                answer[j] = b;
                j++;
            }
            
        }
        
        answer = Arrays.copyOf(answer, j);
        return answer;
    }
}