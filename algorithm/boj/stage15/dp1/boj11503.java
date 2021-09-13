package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 2];
        int[] dp = new int[n + 2];

        String[] line = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(line[i-1]);
        }

        for(int i=1;i<=n;i++)
            dp[i] = 1;

        int maxCnt = 1;
        for(int i=2;i<=n;i++) {
            for(int j=1;j<i;j++) {
                if(arr[i]>arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxCnt = Math.max(maxCnt,dp[i]);
                }
            }
        }

        System.out.println(maxCnt);
    }
}
