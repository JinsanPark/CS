class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            
            str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("woo", " ");
            str = str.replace("ma", " ");
            
            str = str.replace(" ", "");
            
            if(str.equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}