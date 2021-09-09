package 정수삼각형_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        int[][] map = new int[501][501];
        int[][] dp = new int[501][501];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        for(int i=1;i<=num;i++){
            String[] str= br.readLine().split(" ");
            for(int j=1;j<=i;j++){
                map[i][j] = Integer.parseInt(str[j-1]);
            }
        }


        dp[1][1] = map[1][1];
        for(int i=2;i<=num;i++){
            for(int j=1;j<=i;j++) {
                if (j == 1) {
                    dp[i][j] = dp[i - 1][j] + map[i][j];
                }
                else if (j == i) dp[i][j] = dp[i - 1][j - 1] + map[i][j];
                else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j])+map[i][j];
                }
            }
        }
        int max=0;
        for(int i=1;i<=num;i++){
            if(dp[num][i]>=max) max= dp[num][i];
        }
        System.out.println(max);
    }
}
