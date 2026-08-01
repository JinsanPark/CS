import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            
            int st = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            int[] line = new int[end - st + 1];
            int idx = 0;
            
            for(int j = st - 1; j < end; j++){
                line[idx++] = array[j];
            }
            
            Arrays.sort(line);
            answer[i] = line[target - 1];
            
        }
        
        return answer;
    }
}