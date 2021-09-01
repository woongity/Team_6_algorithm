package level11_brute_force;

import java.util.Scanner;

// 백준 1436번 문제] 양화감독 숌
public class Baekjoon1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        int num = 666;

        while(count != n) {
            num++;

            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}
