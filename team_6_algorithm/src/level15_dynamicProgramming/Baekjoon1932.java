package level15_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1932번 문제] 정수 삼각형
public class Baekjoon1932 {
    static int n; // 크기 n의 삼각형형
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        // 입력 start
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++) { // 행의 인덱스의 +1만큼의 요소 입력
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 입력 end

        // 가장 마지막 행의 값들을 DP에 저장
        for (int i=0; i<n; i++) {
            dp[n-1][i] = arr[n-1][i];
        }

        System.out.println(dp(0, 0));
   } //main end

    public static int dp(int r, int c) { // 행, 열
        if(r == (n - 1)) return dp[r][c]; // 저장 되어 있는 마지막행 dp 값들은 바로 반환

        if(dp[r][c] == null) {
            dp[r][c] = arr[r][c] +  Math.max(dp(r+1, c), dp(r+1,c+1));
        }

        return dp[r][c];
    }
}
