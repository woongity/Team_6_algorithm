package stage10.recursive;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

public class boj2447 {
    static char[][] board = new char[6562][6562];

    static void func(int num,int r,int c) {
        //(r,c)좌표에서부터 길이가 num인 별찍기
        if(num==3) {
            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++) {
                    if(i==1 &&j==1) continue;
                    board[r+i][c+j] = '*';
                }
            }
            return;
        }

        int cnt = 0;
        for(int i=r;i<r+num;i+=num/3) {
            for(int j=c;j<c+num;j+=num/3) {
                cnt++;
                if(cnt==5) continue;
                func(num/3,i,j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++)
            Arrays.fill(board[i],' ');

        func(n,0,0);

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                //sb.append(board[i][j]);
                bw.write(board[i][j]);
            }
            bw.write("\n");
            //sb.append("\n");
        }
        bw.flush();
        bw.close();
        //System.out.println(sb.toString());
    }
}
