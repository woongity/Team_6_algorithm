package stage11.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.*;

public class boj7568 {
    static class Pair {
        int h;
        int w;
        Pair(int h,int w) {
            this.h = h;
            this.w = w;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        ArrayList<Pair> list = new ArrayList<>();
        int[] rank = new int[52];

        int n = parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] line = br.readLine().split(" ");
            list.add(new Pair(parseInt(line[0]),parseInt(line[1])));
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if ((list.get(i).h > list.get(j).h) && (list.get(i).w > list.get(j).w)) {
                    rank[j]++;
                }
            }
        }

        for(int i=0;i<n;i++) {
            sb.append(rank[i]+1+" ");
        }

        System.out.println(sb.toString());
    }
}
