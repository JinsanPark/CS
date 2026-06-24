class Solution {
    public int solution(String[] strArr) {
        int[] sizeList = new int[31];
        int answer = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            int sizeStr = strArr[i].length();
            sizeList[sizeStr]++;
        }
        
        for(int i = 1; i < sizeList.length; i++) {
            if(answer < sizeList[i]) {
                answer = sizeList[i];   
            }
        }
        
        return answer;
    }
}