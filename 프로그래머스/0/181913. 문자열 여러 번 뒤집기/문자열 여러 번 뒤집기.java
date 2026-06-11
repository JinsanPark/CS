class Solution {
    public String solution(String my_string, int[][] queries) {
        
        char[] line = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++) {
            
            int s = queries[i][0];
            int e = queries[i][1];
            
            while (s <= e) { 
                char temp = line[s];
                line[s] = line[e];
                line[e] = temp;
                s++;
                e--;                   
            }
        }
        
        String answer = new String(line);
        return answer;
    }
}