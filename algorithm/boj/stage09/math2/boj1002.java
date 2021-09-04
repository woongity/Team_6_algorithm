package algorithm.boj.stage09.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
            String[] line = br.readLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int r1 = Integer.parseInt(line[2]);
            int x2 = Integer.parseInt(line[3]);
            int y2 = Integer.parseInt(line[4]);
            int r2 = Integer.parseInt(line[5]);

            double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            if(x1==x2 && y1==y2 && r1==r2) {
                //두 원이 일치하는 경우
                System.out.println(-1);
            } else if((d>r1+r2) || Math.abs(r1-r2) >d) {
                //두 원이 만나지 않는 경우
                System.out.println(0);
            } else if ((r1+r2==d) || (Math.abs(r1-r2)==d)) {
                //한 점이 만나는 경우
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
