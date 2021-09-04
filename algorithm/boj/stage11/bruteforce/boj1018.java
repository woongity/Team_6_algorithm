package algorithm.boj.stage11.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1018 {
    static int ans = 2505;
    static String[] board;

    static void getAns(int x,int y) {
        int count = 0;

        //맨 처음이 흰색일 경우
        char ch = 'W';
        for(int i=x;i<x+8;i++) {
            for(int j=y;j<y+8;j++) {
                char cur = board[i].charAt(j);
                if(cur!=ch) count++;

                if(ch=='W') ch = 'B';
                else ch = 'W';
            }
            if(ch=='W') ch = 'B';
            else ch = 'W';
        }

        ans = Math.min(ans, count);
        count = 0;

        //맨 처음이 검정섹 경우
        ch = 'B';
        for(int i=x;i<x+8;i++) {
            for(int j=y;j<y+8;j++) {
                char cur = board[i].charAt(j);
                if(cur!=ch) count++;

                if(ch=='W') ch = 'B';
                else ch = 'W';
            }
            if(ch=='W') ch = 'B';
            else ch = 'W';
        }

        ans = Math.min(ans, count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

       board = new String[n];

        for(int i=0;i<n;i++) {
            board[i] = br.readLine();
        }

        for(int i=0;i<=n-8;i++) {
            for(int j=0;j<=m-8;j++) {
                getAns(i, j);
            }
        }

        System.out.println(ans);
    }
}
