package level15_dynamicProgramming;

import java.util.Scanner;

// 백준 1463번 문제] 1로 만들기
public class Backjoon1463 {
    static int[] dp;

    public static void main(String[] args) {
        //입력start
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n + 1]; // 숫자 헷갈리지 않게 1부터 n까지 대입하기 위해 n+1 함
        //입력end

        //dp초기화
        dp[0] = dp[1] = 0;

        for(int i=2; i<=n; i++) {
            // -1 연산을 수행할 경우
            dp[i] = dp[i-1] + 1; // +1은 연산을 수행한 카운터를 하나 올려줌

            if(i%3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
        }

        System.out.println(dp[n]);
    }

}
