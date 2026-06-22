class Solution {
    public int[] solution(String myString) {
        int[] answer = new int[myString.split("x", -1).length];
        String[] str = myString.split("x");
        
        for(int i = 0; i < str.length; i++){
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}