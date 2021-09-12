package level15_dynamicProgramming;

import java.util.Scanner;

//백준 2156번 문제] 포도주 시식
public class Baekjoon2156 {

    public static void main(String[] args) {
        //입력start
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 1부터 입력 가능
        int arr[] = new int[n+1]; //포도주 양의 배열
        int[] dp = new int[n+1]; //포도주 누적합 배열

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        //입력end

        //dp[] 초기화
        dp[1] = arr[1];

        if(n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] +  arr[i], dp[i-3] + arr[i-1] + arr[i]));
        }

        System.out.println(dp[n]);
    }//main end

}