class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];

        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        
        int answer = 0;
        int max = 0;
        int mode = 0;
        
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                answer = i;
                mode = 1;
            } else if (max == count[i]){
                mode++;
            }
        }

        return mode == 1 ? answer : -1;
    }
}