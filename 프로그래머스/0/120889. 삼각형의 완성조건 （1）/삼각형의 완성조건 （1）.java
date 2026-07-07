class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest = 0;
        int idx = 0;
        
        for(int i = 0; i < sides.length; i++){
            if(longest < sides[i]){
                longest = sides[i];
                idx = i;
            }
        }
        
        int sum = 0;
        for(int i = 0; i < sides.length; i++){
            if(idx != i){
                sum += sides[i];
            }
        }
        
        return sum > longest ? 1 : 2;
        
    }
}