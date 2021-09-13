package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 2];
        int[] dpIncrease = new int[n + 2];
        //증가하는 부분수열의 최대 길이(11503)
        int[][] dp = new int[n + 2][n + 2];
        //dp[n][m] : n번째 있는 수가 바이토닉 수열의 최대값일 때 m번째 수를 봤을때의 가장 긴 바이토닉 수열의 길이

        String[] line = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(line[i-1]);
        }

        //dpIncrease 채우기
        for(int i=1;i<=n;i++)
            dpIncrease[i] = 1;

        for(int i=2;i<=n;i++) {
            for(int j=1;j<i;j++) {
                if(arr[i]>arr[j]) {
                    dpIncrease[i] = Math.max(dpIncrease[i], dpIncrease[j] + 1);
                }
            }
        }

        //dp채우기
        int maxLen = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j < i) {
                    if(arr[j] < arr[i]) dp[i][j] = dpIncrease[j];
                    else dp[i][j] = 0;
                } else if (i == j) {
                    dp[i][j] = dpIncrease[j];
                } else {
                    if(arr[j]<arr[i]) {
                        for(int k=1;k<j;k++) {
                            if(arr[j]<arr[k]) dp[i][j] = Math.max(dp[i][j], dp[i][k] + 1);
                        }
                    }
                    else dp[i][j] = 0;
                }
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }

        System.out.println(maxLen);
    }
}
