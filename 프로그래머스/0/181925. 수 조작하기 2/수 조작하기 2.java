class Solution {
    public String solution(int[] numLog) {
        
        int x = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numLog.length - 1; i++) {
        
                x = numLog[i + 1] - numLog[i];

            switch(x) {
                    
                case 1 :
                    sb.append("w");
                    break;
                case -1 :
                    sb.append("s");
                    break;
                case 10 :
                    sb.append("d");
                    break;
                default :
                    sb.append("a");
                    break;
            }
            
        }
        
        String answer = sb.toString();
        return answer;
    }
}