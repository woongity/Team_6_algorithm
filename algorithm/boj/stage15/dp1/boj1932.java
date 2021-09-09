package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];

        for(int i=1;i<=n;i++) {
            String[] line = br.readLine().split(" ");
            for(int j=1;j<=i;j++) {
                arr[i][j] = Integer.parseInt(line[j - 1]);
            }
        }

        dp[1][1] = arr[1][1];

        for(int i=2;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(j==1) dp[i][j] = dp[i-1][1] + arr[i][j];
                else if(j==i) dp[i][j] = dp[i-1][j-1] + arr[i][j];
                else dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + arr[i][j];
            }
        }

        int result = 0;
        for(int i=1;i<=n;i++) {
            result = Math.max(result,dp[n][i]);
        }

        System.out.println(result);

    }
}