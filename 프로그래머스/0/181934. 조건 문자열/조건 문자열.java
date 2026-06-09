class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        
        boolean answer = switch (ineq + eq) {
                case "<=" -> n <= m;
                case ">=" -> n >= m;
                case ">!" -> n > m;
                case "<!" -> n < m;
                default -> throw new IllegalStateException("Unexpected value: " + ineq + eq);
        };
        
        if (answer) {
            return 1;
        } else {
            return 0;
        }
    
    }
}