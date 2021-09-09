package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n+1][3]; //<R,G,B>
        int[][] dp =  new int[n+1][3];
        //dp[a][b] : a번의 집을 b로 칠했을 때 최소 비용

        for(int i=1;i<=n;i++) {
            String[] line = br.readLine().split(" ");
            cost[i][0] = Integer.parseInt(line[0]);
            cost[i][1] = Integer.parseInt(line[1]);
            cost[i][2] = Integer.parseInt(line[2]);
        }

        //초기값 설정
        dp[1][0] = cost[1][0];
        dp[1][1] = cost[1][1];
        dp[1][2] = cost[1][2];

        for(int i=2;i<=n;i++ ){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + cost[i][2];
        }

        int min_cost = Math.min(dp[n][0], dp[n][1]);
        min_cost = Math.min(min_cost,dp[n][2]);

        System.out.println(min_cost);
    }
}
