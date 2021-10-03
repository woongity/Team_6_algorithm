package level08_basicMath1;

import java.util.Scanner;

//백준 2292번 문제: 벌집
public class Baekjoon2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1; //겹 수
        int range = 1; //겹 수의 최대값

        if(n == 1) System.out.println(1);
        else {
            while (range < n) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}