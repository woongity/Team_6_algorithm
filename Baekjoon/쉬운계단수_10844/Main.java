package 쉬운계단수_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[101][10];

        for(int i=0;i<10;i++){
            dp[1][i] = 1;
        }
        for(int i=2;i<=num;i++){
            for(int j=0;j<=9;j++){
                if(j==0){
                    dp[i][j] = dp[i-1][1]%1000000000;
                }else if(j==9){
                    dp[i][j] = dp[i-1][8]%1000000000;
                }else{
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
                }
            }
        }
        int sum=0;
        for (int i = 1; i < 10; i++) {
            sum = (sum + dp[num][i])%1000000000;
        }
        System.out.println(sum);
    }
}
