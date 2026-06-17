import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        
        int x = -1;
        int[] arrPre = new int[arr.length];  
        boolean check = false;
        
        while(!check) {
            
            arrPre = Arrays.copyOf(arr, arr.length);
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (50 > arr[i] && arr[i] % 2 != 0) {
                    arr[i] = 2 * arr[i] + 1;
                }
            }
            
            x++;
            check = Arrays.equals(arrPre, arr);
            
        }
        
        return x;
    }
}