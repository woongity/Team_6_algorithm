package level10_recursion;

import java.util.Scanner;

// 백준 11729 문제] 하노이 탑 이동 순서
public class Baekjoon11729_Retry {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 원판의 개수

        sb.append((int)(Math.pow(2,n)-1)).append('\n');

        hanoi(n, 1,2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int from, int via, int to) {
        // Base Condition: 원반 1개일 경우
        if(n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }

        // 원반 n-1개  1 -> 2 기둥으로 옮긴다.
        hanoi(n-1, from, to, via);

        // 1개의 원반을 1 -> 3 기둥으로 옮긴다.
        sb.append(from + " " + to + "\n");

        // 원반 n-1개를 2 -> 3 기둥으로 옮긴다.
        hanoi(n-1, via, from, to);
    }
}
