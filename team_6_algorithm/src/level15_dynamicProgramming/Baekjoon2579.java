package level15_dynamicProgramming;

import java.util.Scanner;

// 백준 2579번 문제] 계단 오르기
public class Baekjoon2579 {
    static int[] stairs; //각 계단의 점수
    static Integer[] dp; //누적합

    public static void main(String[] args) {
        // 입력 start
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        stairs = new int[n];
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            stairs[i] = sc.nextInt();
        }
        // 입력 end

        // dp 배열 초기화
        dp[0] = stairs[0];

//        1. 한 번에 한 계단씩
//        2. 한 번에 두 계단씩
//        3. 마지막 계단을 꼭 밟기 위해서는 2칸 전에 뛰던가, 1칸 전에 뛰언가 해야 함

        System.out.println(dp[n]);
    }
}
