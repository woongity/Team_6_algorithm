package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2133 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[32];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 3;

        for(int i=3;i<=n;i++) {
            dp[i] = dp[i-2] *3;
            for(int j=i-4;j>=0;j-=2) {
                dp[i] += dp[j] *2;
            }
        }
        System.out.println(dp[n]);
    }
}
