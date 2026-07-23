class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        while(i <= j){
            
            char a =(char) ( k + '0');
            char[] c = String.valueOf(i).toCharArray();
            
            for(int x = 0; x < c.length; x++){
                if(c[x] == a){
                    answer++;
                }
            }
            i++;
        }
        return answer;
    }
}