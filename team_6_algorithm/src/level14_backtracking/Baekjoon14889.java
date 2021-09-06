package level14_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 14889번 문제] 스타트와 링크
public class Baekjoon14889 {
    static int stoi(String s) {return Integer.parseInt(s); }

    static int n;
    static boolean[] check;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = stoi(br.readLine());
        check = new boolean[n];
        arr = new int[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = stoi(st.nextToken());
            }
        }

        teamComb(0, 0);
        System.out.println(min);
    }

    // 팀 조합 구하기
    public static void teamComb(int start, int dept) {
        if(dept == n/2) {
            min = Math.min(min, getValue());
            return;
        }

        for(int i=start; i<n; i++) {
            if(check[i] != true) {
                check[i]= true;
                teamComb(i+1,dept+1);
                check[i] = false;
            }
        }
    }

    // 팀 능력치 차이 구하기
    public static int getValue(){
        int sumStart = 0;
        int sumLink = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                // 스타트팀은 true
                if(check[i] && check[j]) sumStart += arr[i][j];

                // 링크팀은 false
                if(!check[i] && !check[j]) sumLink += arr[i][j];
            }
        }

        return Math.abs(sumStart - sumLink); // 절대값 반환
    }
}
