package level14_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15651번 문제] N과 M (3)
public class Baekjoon15651 {
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        n = Integer.parseInt(strs[0]); // n까지
        m = Integer.parseInt(strs[1]); // m개의 수열
        arr = new int[m];

        dp(0);
        System.out.println(sb);
    } // main end

    public static void dp(int count) {
        if(count == m) { // 하나의 배열 완성
            for(int val : arr) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++) {
            arr[count] = i;

            dp(count+1);
        }
    } //dp end
}