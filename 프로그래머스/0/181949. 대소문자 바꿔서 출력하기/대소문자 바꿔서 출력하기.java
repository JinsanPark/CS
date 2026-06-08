import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int C = 65;
        int c = 97;
        char[] line = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < line.length; i++) {
            
            if(line[i] < c) {
                line[i] += c - C;
            } else {
                line[i] -= c - C;
            }
            
            sb.append(line[i]);
        }
        
        System.out.println(sb);
    }
}