package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] step = new int[n + 1];
        int[][] dp = new int[n+1][3];
        //dp[i][j] : 현재까지 j개 계단을 연속해서 밟고 i번째 계단까지 올라섰을 때
        //           점수 하의 최대값 (단 i번째 계단은 반드시 밟아야 함)
        //점화식 : dp[i][1] = max(dp[i-2][1],dp[i-2][2]) + step[i];
        //        dp[i][2] = dp[i-1][1] + step[i];

        for(int i=1;i<=n;i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        //초기값
        dp[1][1] = step[1];
        dp[1][2] = 0;
        dp[2][1] = step[2];
        dp[2][2] = step[1] + step[2];

        for(int i=3;i<=n;i++) {
            dp[i][1] = Math.max(dp[i-2][1],dp[i-2][2]) + step[i];
            dp[i][2] = dp[i-1][1] + step[i];
        }

        System.out.println(Math.max(dp[n][1],dp[n][2]));

    }
}
