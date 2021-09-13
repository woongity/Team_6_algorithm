package algorithm.boj.stage15.dp1;

import java.util.Scanner;

public class boj10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] dp = new long[n+2][10];
        //dp[n][m] : 길이가 n이고 m으로 시작하는 계단수의 갯수

        for(int i=1;i<=9;i++) {
            dp[1][i] = 1;
        }

        for(int i=2;i<=n;i++) {
            for(int j=0;j<=9;j++) {
                if(j==0) dp[i][j] = dp[i-1][1];
                else if(j==9) dp[i][j] = dp[i-1][8];
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] % 1000000000;
            }
        }

        long total = 0;
        for(int i=0;i<=9;i++) {
            total += dp[n][i];
            total %= 1000000000;
        }

        System.out.println(total);
    }
}
