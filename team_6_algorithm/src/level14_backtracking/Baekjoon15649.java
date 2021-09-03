package level14_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15649번 문제] N과 M (1)
public class Baekjoon15649 {
    public static int[] arr;
    public static boolean[] check;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        n = Integer.parseInt(strs[0]); // n까지
        m = Integer.parseInt(strs[1]); // m개의 수열
        arr = new int[m];
        check = new boolean[n+1];

        dp(0);
    } // main end

    public static void dp(int count) {
        if(count == m) { // 하나의 배열 완성
            for(int i=0; i<m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=n; i++) {
            if(check[i]) continue; // true 일 경우 방문했던 위치이기 때문에 지나감!
            check[i] = true; // 방문 체크
            arr[count] = i; // 배열 채우기
            dp(count+1); // 배열의 다음 칸 이동 후 반복, 한 단계?과정?을 마무리 하는 시점에 재귀!
            check[i] = false; // 끝까지 방문 후 초기화
        }
    } //dp end
}
