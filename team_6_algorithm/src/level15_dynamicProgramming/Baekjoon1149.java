package level15_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1149번 문제] RGB거리
public class Baekjoon1149 {
    public static int n; // 집의 개수
    public static int[][] arr; // 각 집의 페인팅 비용
    public static  int[][] dp; // 누적합 저장 배열


    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine()); // 집의 개수
        arr = new int[n][3]; // 각 집의 페인팅 비용
        dp = new int[n][3]; // 누적합 저장 배열

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 입력 end

        // dp[][] 초기화
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        System.out.println(Math.min(Math.min(dp(n-1, 0), dp(n-1, 1)), dp(n-1, 2)));

    } //main end

    public static int dp(int n, int color) { // 위치, 컬러
        if(dp[n][color] == 0) { // 계산한 누적합이 없을 경우
            // 색상에 따라서 이전 집의 다른색상을 재귀 호출하여 더 작은 값과 현재의 집의 비용을 더해서 저장
            if(color == 0) {
                dp[n][color] = arr[n][color] + Math.min(dp(n-1, 1), dp(n-1, 2)); // 현재 위치의 비용과 이전 집의 누접값을 더함!
            } else if(color == 1) {
                dp[n][color] = arr[n][color] + Math.min(dp(n-1, 0), dp(n-1, 2));
            } else {
                dp[n][color] = arr[n][color] + Math.min(dp(n-1, 0), dp(n-1, 1));
            }
        }
        return dp[n][color];
    }

}
