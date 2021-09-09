package 계단오르기_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static int[] dp;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp = new int[301];
        arr = new int[301];
        for(int i=1;i<=num;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = arr[1]+arr[2];
        for(int i=3;i<=num;i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+arr[i-1]) + arr[i];
        }
        System.out.println(dp[num]);
    }
}
