class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;
        
        int answer = 0;
        int[] t = new int[5];
        
        for (int i = 1; i < 7; i++) {
            if(count[i] != 0) {
                t[count[i]]++;
            }
        }
        
        int p = 7;
        int q = 0;
        int r = 0;

       if(t[4] == 1) {
           answer = a * 1111;
       } else if (t[3] == 1 && t[1] == 1) {
           
           for (int i = 1; i < 7; i++) {
               if(count[i] == 3) {
                   p = i;
               } else if (count[i] == 1) {
                   q = i;
               }
           }
           
           answer = (10 * p + q) * (10 * p + q);
       } else if (t[2] == 2) {
           for (int i = 1; i < 7; i++) {
               if(count[i] == 2 && p == 7){
                   p = i;
               } else if (count[i] == 2) {
                   q = i;
               }; 
           };
           
           answer = (p + q) * Math.abs(p - q);
           
       }  else if(t[2] == 1 && t[1] == 2) {
            for (int i = 1; i < 7; i++) {
               if(count[i] == 2) {
                   p = i;
               } else if (count[i] == 1 && q == 0) {
                   q = i;
               } else if (count[i] == 1) {
                   r = i;
               };
           };
           
           answer = q * r;
           
       } else if (t[1] == 4) {
           answer = Math.min(a, Math.min(b, Math.min(c,d)));
       };
        
        
        return answer;
    }
}
