class Solution {
    public int[] solution(int[] arr) {
        
        int leftP = 0;
        int rightP = arr.length - 1;
        
        while((arr[rightP] != 2 || arr[leftP] != 2) && leftP <= rightP) {
            
            if(arr[leftP] != 2) {
                leftP++;
            }
            
            if(arr[rightP] != 2){
                rightP--;
            }  
        }
        
        if(leftP < arr.length && arr[leftP] == 2) {
            int[] answer = new int[rightP - leftP + 1];
            int x = 0;
            for(int i = leftP; i <= rightP; i++) {
                answer[x++] = arr[i];
            }
            return answer;
        } else {
            return new int[]{-1};
        }
    }
}