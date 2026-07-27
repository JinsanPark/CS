class Solution {
    public int solution(String A, String B) {
        
        int answer = -1;
        char[] ac = A.toCharArray();
        char[] bc = B.toCharArray();
        int len = ac.length;

        for(int i = 0; i < len; i++){
            int count = 0;
            for(int j = 0; j < len; j++){
                if(ac[(len - i + j) % len] == bc[j]){
                    count++;
                }
            }
            
            if(count == len){
                return i;
            }
        }
        return answer;
    }
}