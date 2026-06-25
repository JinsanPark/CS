import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int len = rank.length;
        int[][] arr = new int[len][2];
        
        for (int i = 0; i < len; i++) {
            arr[i][0] = rank[i];
            arr[i][1] = i;
        }
        
        Arrays.sort(arr, (x,y) -> x[0] - y[0]);
        
        int count = 0;
        int[] topThree = new int[3];
        
        for(int i = 0; i < len; i++){
            if(attendance[arr[i][1]]) {
                topThree[count] = arr[i][1];
                count++;
            }
            
            if(count == 3){
                break;
            }
        }
        
        int answer = 10000 * topThree[0] + 100 * topThree[1] + topThree[2];
        
        return answer;
    }
}