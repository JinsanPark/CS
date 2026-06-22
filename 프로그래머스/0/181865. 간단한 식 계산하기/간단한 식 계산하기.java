class Solution {
    public int solution(String binomial) {
        
        String[] str = binomial.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        int answer = 0;
        
        switch(str[1]) {
                case "+" -> answer = a + b;
                case "-" -> answer = a - b;
                case "*" -> answer = a * b;
        }
        
        return answer;
    }
}