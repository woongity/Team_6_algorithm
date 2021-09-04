package algorithm.boj.stage11.bruteforce;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class boj1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int num = 666;
        while(count<n) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}
