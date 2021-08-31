package level10_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11729 문제] 하노이 탑 이동 순서
public class Baekjoon11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }  //main end

    public static void Hanoi(int N, int A, int B, int C) {
        // Base Condition: 원반의 개수가 1개일 경우
        if (N == 1) {
            sb.append(A + " " + C + "\n");
            return;
        }
        // STEP 1 : N-1개를 A에서 B로 이동
        Hanoi(N - 1, A, C, B);

        // STEP 2 : 1개를 A에서 C로 이동
        sb.append(A + " " + C + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        Hanoi(N - 1, B, A, C);

    } //Hanoi end
}
