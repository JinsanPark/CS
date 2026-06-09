class Solution {
    public int solution(int[] num_list) {
    
        int mul = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        
        sum *= sum;
        int answer = mul > sum ? 0 : 1;
        return answer;
    }
}