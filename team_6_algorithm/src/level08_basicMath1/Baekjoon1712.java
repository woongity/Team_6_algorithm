package level08_basicMath1;

import java.io.IOException;
import java.util.Scanner;

//백준 1712번 문제: 손익분기점
public class Baekjoon1712 {
    public static void main(String[] args) throws IOException {
        //입력 시작
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //입력 끝

        if(b >= c) {
            System.out.println("-1");
        } else {
            System.out.println(a/(c-b)+1);
        }
    }
}
