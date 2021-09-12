package level15_dynamicProgramming;

import java.util.Scanner;

// 백준 10844번 문제] 쉬운 계단 수
public class Baekjoon10844 {

    public static void main(String[] args) {
        //입력start
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //입력end

        long[][] dp = new long[n+1][10]; //[자릿수][0~9]

        //dp배열 초기화 : 자릿수가 1일 경우 각 숫자가 사용될 수 있는 경우의 수는 1씩뿐!
        for(int i=1; i<=9; i++) {
            dp[1][i] = 1;
        }

        //자릿수가 2인 경우부터 이전 자릿수인 1의 자릿수와 비교하며 다음에 올 수 있는 경우의 수를 구함
        for(int i=2; i<=n; i++) {
            for(int j=0; j<10; j++) { // 0 ~ 9
                if(j == 0) dp[i][j] = (dp[i-1][j+1]) % 1000000000; // 끝자리가 0일 경우는 1일 때만 고려
                else if(j == 9) dp[i][j] = dp[i-1][j-1] % 1000000000; // 끝자리가 9일 경우는 8일 때만 고려
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] % 1000000000; // 나머지는 -1, +1 모두 고려
            }
        }

        long sum = 0;
        for(int i=0; i<10; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum % 1000000000);
    }

}
