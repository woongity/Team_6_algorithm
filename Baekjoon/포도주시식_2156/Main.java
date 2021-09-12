package 포도주시식_2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        int[] arr = new int[10001];
        int[][] dp = new int[10001][3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        dp[1][2] = 0;
        dp[1][1] = arr[1];
        dp[2][1] = arr[2];
        dp[2][2] = arr[2]+arr[1];
        dp[3][1] = arr[1]+arr[3];
        dp[3][2] = arr[2]+arr[3];
        for(int i=4;i<=num;i++){
            dp[i][2] = dp[i-1][1]+arr[i];
            int max = dp[i-2][1];
            if(dp[i-2][2]>max) max=dp[i-2][2];
            if(dp[i-3][1]>max) max = dp[i-3][1];
            if(dp[i-3][2]>max) max = dp[i-3][2];
            dp[i][1] = max+arr[i];
        }
        int max = 0;
        for(int i=1;i<=num;i++){
            if(dp[i][1]>max) max=dp[i][1];
            if(dp[i][2]>max) max=dp[i][2];
        }

        System.out.println(max);
    }
}
