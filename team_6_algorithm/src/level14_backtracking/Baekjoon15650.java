package level14_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15650번 문제] N과 M (2)
public class Baekjoon15650 {
    public static int[] arr;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        n = Integer.parseInt(strs[0]); // n까지
        m = Integer.parseInt(strs[1]); // m개의 수열
        arr = new int[m];

        dp(0, 1);
    } // main end

    public static void dp(int count, int num) {
        if(count == m) { // 하나의 배열 완성
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=num; i<=n; i++) {
            arr[count] = i;

            // 다음 배열에 들어가는 i의 값이 이전의 값보다 더 커야하므로 i+1,
            // 이러한 경우 값이 중복될 경우가 없어서 중복 체크도 없어짐!
            dp(count+1, i+1);
        }
    } //dp end
}