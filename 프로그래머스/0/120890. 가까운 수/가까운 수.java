class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int min = 100;
        
        for(int i = 0; i < array.length; i++){
            if(Math.abs(n - array[i]) < min) {
                answer = array[i];
                min = Math.abs(n - array[i]);
            } else if(Math.abs(n - array[i]) == min && answer > array[i]){
                answer = array[i];
            }
        }
        
        return answer;
    }
}