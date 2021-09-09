package algorithm.boj.stage15.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int[] weight = new int[n + 2];
        int[] value = new int[n + 2];
        int[][] dp = new int[n + 2][100002];
        //dp[i][k] : 현재 i번째 물건을 봤고 가방의 무게가 k일 때 가방에 담긴 가치
        //고려해야 할 것
        //1. 해당 무게를 나타내는 테이블에 현재 물건을 넣을 수 있는가?
        //2. 해당 물건을 넣을것인가?(가치가 더 큰가?)

        for(int i=1;i<=n;i++) {
            line = br.readLine().split(" ");
            weight[i] = Integer.parseInt(line[0]);
            value[i] = Integer.parseInt(line[1]);
        }

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=k;j++) {
                if(weight[i]>j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
            }
        }

        System.out.println(dp[n][k]);
    }
}
