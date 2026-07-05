class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        if(direction.equals("right")){
            for(int i = 0; i < len; i++){
                answer[i] = numbers[(i + len - 1) % len];
            }
        } else {
            for(int i = 0; i < len; i++){
                answer[i] = numbers[(i + 1) % len];
            }
        }
        
        return answer;
    }
}