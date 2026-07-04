import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[][] rank = new int[emergency.length][2];
        
        for(int i = 0; i < answer.length; i++){
            rank[i][0] = emergency[i];
            rank[i][1] = i;
        }
        
        Arrays.sort(rank, (x,y) -> Integer.compare(x[0], y[0]));
        
        int num = 1;
        for(int i = answer.length - 1; i >= 0; i--){
            answer[rank[i][1]] = num++; 
        } 
        
        return answer;
    }
}