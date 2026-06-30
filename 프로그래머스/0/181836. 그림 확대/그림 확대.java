class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        
        for(int i = 0; i < picture.length; i++){
            
            char[] c = picture[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < c.length; j++){
                for(int x = 0; x < k; x++){
                    sb.append(c[j]);
                }
            }
            
            for(int j = 0; j < k; j++){
                answer[idx++] = sb.toString();
            }
            
        }
        
        return answer;
    }
}