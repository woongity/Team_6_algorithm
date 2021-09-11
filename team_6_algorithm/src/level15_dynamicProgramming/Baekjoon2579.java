package level15_dynamicProgramming;

import java.util.Scanner;

// 백준 2579번 문제] 계단 오르기
public class Baekjoon2579 {
    static int n;
    static int[] stairs; //각 계단의 점수
    static Integer[] dp; //누적합

    public static void main(String[] args) {
        //입력 start
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        stairs = new int[n];
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            stairs[i] = sc.nextInt();
        }
        //입력 end

        //dp 초기화 : 해당 계단을 마지막 계단이라고 생각하고 판단한 경우!
        if(n > 0) dp[0] = stairs[0]; // 첫 계단은 무조건 밟아..?
        if(n > 1) dp[1] = stairs[0] + stairs[1];// 만약 두 번째 계단을 밟게 된다면, 첫 번째와 두번째 계단을 모두 밟는 것이 이득!
        if(n > 2) dp[2] = Math.max(stairs[2] + stairs[0], stairs[2] + stairs[1]);

        // 마지막 계단에 도착하는 두 가지 경우 중 값이 더 큰 값으로 누적!
        for(int i=3; i<n; i++) {
            dp[i] = Math.max(stairs[i] + dp[i-2], stairs[i] + stairs[i-1] + dp[i-3]);
        }

        System.out.println(dp[n-1]);
    }
}
