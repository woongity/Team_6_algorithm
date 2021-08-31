package level10_recursion;

import java.util.Scanner;

// 백준 10872 문제] 팩토리얼
public class Baekjoon10872 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = factorial(n);
    System.out.println(result);
    } //main end

    public static int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
