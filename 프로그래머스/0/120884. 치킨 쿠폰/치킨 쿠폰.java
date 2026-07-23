class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon > 9) {
            int left = 0;
            answer += coupon / 10;
            left = coupon % 10;
            coupon /= 10;
            coupon += left;
        }
        
        return answer;
    }
}