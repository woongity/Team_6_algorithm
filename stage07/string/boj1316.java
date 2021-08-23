package stage07.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int test = 0;test<t;test++) {
            String str = br.readLine();

            boolean[] check = new boolean[26];
            boolean posi = true;
            for(int i=0;i<str.length();i++) {
                //이전에 나온적이 있다면
                if (check[str.charAt(i)-'a']) {
                    if(str.charAt(i-1) != str.charAt(i)) {
                        posi = false;
                        break;
                    }
                } else {
                    //처음 나온 문자
                    check[str.charAt(i)-'a'] = true;
                }
            }
            if(posi) ans++;
        }
        System.out.println(ans);
    }
}
