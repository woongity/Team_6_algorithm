package 일로만들기_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] dp= new int[1000001];
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3;i<=num;i++){
            int min = 1000001;
            if(i%3==0){
                if(i%2==0){
                    min = Math.min(dp[i/3],Math.min(dp[i/2],dp[i-1]));
                }else{
                    // 3의 배수이지만 2의 배수는 아님
                    min = Math.min(dp[i/3],dp[i-1]);
                }
            }else{
                if(i%2==0){
                    min = Math.min(dp[i/2],dp[i-1]);
                }
                else{
                    min = dp[i-1];
                }
            }
            dp[i] =min+1;
        }
        System.out.println(dp[num]);
    }
}
