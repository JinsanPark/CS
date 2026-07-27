class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0];
        
        if(common[1] + a == common[2]){
            answer = common[common.length - 1] + a;
            
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}