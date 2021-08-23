package stage07.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int ans = line.length();
        for(int i=0;i<line.length();i++) {
            char ch = line.charAt(i);

            if (ch<'A') ans += 10;
            else if (ch<='C') ans += 2;
            else if (ch<='F') ans += 3;
            else if (ch<='I') ans += 4;
            else if (ch<='L') ans += 5;
            else if (ch<='O') ans += 6;
            else if (ch<='S') ans += 7;
            else if (ch<='V') ans += 8;
            else ans += 9;
        }
        System.out.println(ans);
    }
}
