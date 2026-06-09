class Solution {
    public String solution(String code) {
        
        char[] arr = code.toCharArray();
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        int i = 0;
        
        while (i < code.length()) {
            if(mode == 0) {
                if(arr[i] == '1') {
                mode = 1;
            } else if (i % 2 == 0) {
                ret.append(arr[i]);
            };
                
            } else {
                if (arr[i] == '1') {
                    mode = 0;
                } else if (i % 2 != 0) {
                    ret.append(arr[i]);
                }
            }
            i++;
          };
        
            String answer = "";        

        if (ret.isEmpty()) {
            return answer = "EMPTY";
        } else {
            answer = ret.toString();
            return answer;
        }
            

    }
}