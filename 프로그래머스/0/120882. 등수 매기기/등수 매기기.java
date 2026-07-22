import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        int[][] avg = new int[len][2];
        
        for(int i = 0; i < len; i++){
            int a = (score[i][0] + score[i][1]);
            avg[i][0] = i;
            avg[i][1] = a;
        }
        
        Arrays.sort(avg, (a,b) -> Integer.compare(b[1], a[1]));
        int prevScore = -1;
        int rank = 1;
        
        for(int i = 0; i < len; i++){
            
            if(i > 0) {
                prevScore = avg[i - 1][1];
            }
            
            if(prevScore == avg[i][1]){
                answer[avg[i][0]] = answer[avg[i - 1][0]];
                rank ++;
            } else {
                answer[avg[i][0]] = rank++;
            }
        }
        
        return answer;
    }
}