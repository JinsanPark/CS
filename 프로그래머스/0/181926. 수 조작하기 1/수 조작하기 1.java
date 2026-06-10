class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] line = control.toCharArray();
        
        for(int i = 0; i < line.length; i++) {
            
            if(line[i] == 'w') {
                answer++;
            } else if (line[i] == 's') {
                answer--;
            } else if (line[i] == 'd') {
                answer += 10;
            } else {
                answer -= 10;
            }
            
        }
        
        return answer;
    }
}