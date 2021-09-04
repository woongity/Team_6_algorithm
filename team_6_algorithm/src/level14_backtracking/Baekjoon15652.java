package level14_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15652번 문제] N과 M (4)
public class Baekjoon15652 {
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        n = Integer.parseInt(strs[0]); // n까지
        m = Integer.parseInt(strs[1]); // m개의 수열, 깊이?
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
            if(count > 0) { // 배열[0]이 채워진 경우, 깊이 1단계를 지난 이후
                if(arr[count-1] > i) continue; // 이후 올 값이 이전 값보다 작다면 패스
            }
            arr[count] = i; // 배열 채우기
            dp(count+1); // 배열의 다음 칸 이동 후 반복, 한 단계?과정?을 마무리 하는 시점에 재귀!
        }
    } //dp end
}
