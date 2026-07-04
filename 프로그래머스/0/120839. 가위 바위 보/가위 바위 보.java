class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        char[] c = rsp.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            switch (c[i]) {
                    case '2' -> sb.append("0");
                    case '0' -> sb.append("5");
                    default -> sb.append("2");
            }
        }
        
        return sb.toString();
    }
}