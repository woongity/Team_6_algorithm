package algorithm.boj.stage08.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][15];

        //초기화 : 0층에 i호에는 i명이 산다
        for(int i=1;i<=14;i++)
            arr[0][i] = i;

        //i층의 j호에 사는 사람 수 : i층의 j-1호에 사는 사람 수 + i-1층의 j호에 사는 사람 수
        for(int i=1;i<=14;i++) {
            for(int j=1;j<=14;j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        for(int test = 0;test<t;test++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[k][n]);
        }
    }
}
