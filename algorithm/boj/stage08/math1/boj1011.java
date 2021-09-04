package algorithm.boj.stage08.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int test = 0;test<t;test++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            int dist = y-x;
            int max = (int)Math.sqrt(dist);

            if(dist==max * max) {
                System.out.println(max*2-1);
            } else if (dist <= max*max+max) {
                System.out.println(max*2);
            } else {
                System.out.println(max*2+1);
            }
        }
    }
}
