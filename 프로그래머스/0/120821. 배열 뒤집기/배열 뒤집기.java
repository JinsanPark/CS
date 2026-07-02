class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int len = answer.length;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[--len];
        }
        
        return answer;
    }
}