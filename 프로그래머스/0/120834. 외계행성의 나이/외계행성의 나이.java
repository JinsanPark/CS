class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        int[] line = new int[String.valueOf(age).length()];
        
        for(int i = 0; i < line.length; i++){
            line[i] = age % 10;
            age /= 10;
            sb.append( (char) (line[i] + 'a'));
        }
        
        sb.reverse();
        return sb.toString();
    }
}