class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest = 0;
        int a = 0;
        
        if(sides[0] > sides[1]){
            longest = sides[0];
            a = sides[1];
        } else {
            longest = sides[1];
            a = sides[0];
        }
        
        for(int i = 1; i <= longest; i++){
            if(longest < i + a){
                answer++;
            }
        }
        
        for(int i = longest + 1; ; i++){
            if(i < sides[0] + sides[1]){
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}