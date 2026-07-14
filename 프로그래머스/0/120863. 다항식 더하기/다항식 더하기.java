class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        
        int xCount = 0;
        int numCount = 0;
        String[] str = polynomial.split(" \\+ ");
        
        for(int i = 0; i < str.length; i++){
            if(str[i].contains("x")){
                str[i] = str[i].replace("x","");
                if(str[i].equals("")){
                    xCount++;
                } else {
                    xCount += Integer.parseInt(str[i]);
                }
            } else {
               numCount += Integer.parseInt(str[i]); 
            }
        }
        
        if(xCount == 1){
            sb.append("x");
        } else if(xCount != 0){
            sb.append(xCount + "x");
        }
        
        if(xCount != 0 && numCount != 0) {
            sb.append(" + ").append(numCount);
        } else if(numCount != 0) {
            sb.append(numCount);
        }
        
        return sb.toString();
    }
}