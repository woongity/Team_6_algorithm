package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 2];
        int[] dp = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if(n==1) {
            System.out.println(dp[1]);
            System.exit(0);
        }
        dp[2] = arr[1] + arr[2];
        if(n==2) {
            System.out.println(dp[2]);
            System.exit(0);}
        dp[3] = Math.max(arr[1],arr[2]) +arr[3];

        for(int i=4;i<=n;i++) {
            dp[i] = Math.max(dp[i-2],arr[i-1] + dp[i-3]) + arr[i];
            dp[i] = Math.max(dp[i], arr[i - 1] + dp[i - 4] + arr[i]);
        }

        System.out.println(Math.max(dp[n], dp[n - 1]));
    }
}
