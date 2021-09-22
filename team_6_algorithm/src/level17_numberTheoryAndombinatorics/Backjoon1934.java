package level17_numberTheoryAndombinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 1934번 문제] 최소공배수
public class Backjoon1934 {
    static int gcd = 0;

    public static void main(String[] args) throws IOException {
        //입력 시작
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); //테스트케이스의 수
        int aNb[][] = new int[t][2];

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++) {
                aNb[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //입력 끝

        //최소공배수 구하기 : 최소공배수 = 두 수의 곱 / 최대공약수
        for(int i=0; i<t; i++) {
            int a = aNb[i][0];
            int b = aNb[i][1];
            gcd(a, b);
            int lcm = a * b / gcd;
            System.out.println(lcm);
        }
    }

    //두 수의 최대공약수 구하기
    //유클리드 호제법 사용
    public static void gcd(int a, int b) {
        if(b == 0) {
            gcd = a;
            return;
        }
        gcd(b, a % b);
    }
}
