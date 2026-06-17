class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        int answer = 0;        

        for (int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                sum += num_list[i];
            } else {
                answer += num_list[i];
            }
        }
        
        if(sum > answer) {
            answer = sum;
        }
        
        return answer;
    }
}