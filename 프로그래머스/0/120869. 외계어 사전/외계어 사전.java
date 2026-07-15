class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int[] lineS = new int[26];
        int[] lineD;
        
        
        for(int i = 0; i < spell.length; i++){
            lineS[spell[i].charAt(0) - 'a']++;
        }
        
        for(int i = 0; i < dic.length; i++){
            char[] c = dic[i].toCharArray();
            lineD = new int[26];
            boolean flag = true;
            
            for(int j = 0; j < c.length; j++){
                lineD[c[j] - 'a']++;
            }
            
            for(int j = 0; j < 26; j++) {
                if(lineS[j] != lineD[j]){
                    flag = false;
                } 
            }
            
            if(flag){
                answer = 1;
                break;
            }
            
        }
        
        return answer;
    }
}