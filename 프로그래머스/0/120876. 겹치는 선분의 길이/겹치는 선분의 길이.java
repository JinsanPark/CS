class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] com = new int[200];
        
        for(int i = 0; i < 3; i++){
            
            int str = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            
            for(int j = str; j < end; j++){
                com[j]++;
            }
        }
        
        for(int i = 0; i < 200; i++){
            if(com[i] >= 2){
                answer++;
            }
        }
        
        return answer;
    }
}