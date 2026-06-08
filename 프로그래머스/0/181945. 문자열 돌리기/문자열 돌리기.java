import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String str = br.readLine();
        char[] line = str.toCharArray();
        
        for(int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
        
    }
}