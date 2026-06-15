class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int x = 0;
        int[] answer;
            
        switch (n) {
                case 1 -> {
                    answer = new int[b + 1];
                    for(int i = 0; i < answer.length; i++){
                        answer[i] = num_list[i];
                    }
                }
                
                case 2 -> {
                    answer = new int[num_list.length - a];
                    for(int i = a; i < num_list.length; i++){
                        answer[x] = num_list[i];
                        x++;
                    }
                }
                
                case 3 -> {
                    answer = new int[b - a + 1];
                    for(int i = a; i <= b; i++) {
                        answer[x] = num_list[i];
                        x++;
                    }
                }
                
                default -> {
                    answer = new int[(b - a  + c) / c ];
                    for(int i = a; i <= b;){
                        answer[x] = num_list[i];
                        i += c;
                        x++;
                    }
                }
        }
        
        return answer;
    }
}