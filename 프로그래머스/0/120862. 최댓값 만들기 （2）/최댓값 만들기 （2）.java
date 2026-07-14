import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        
        Arrays.sort(numbers);
        int a = numbers[0] * numbers[1];
        int b = numbers[len - 1] * numbers[len - 2];
    
        return a > b ? a : b;
    }
}