class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int round = 0;
        int idx1 = bin1.length() - 1;
        int idx2 = bin2.length() - 1;

        while(idx1 >= 0 || idx2 >= 0 || round != 0){
            
            int count = 0;

            if(idx1 >= 0){
                count += bin1.charAt(idx1--) - '0';
            } 
            if(idx2 >= 0){
                count += bin2.charAt(idx2--) - '0';
            } 
        
            count += round;
            round = count / 2;
            sb.append(count % 2);
        }
        return sb.reverse().toString();
    }
}