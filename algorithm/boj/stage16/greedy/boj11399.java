package algorithm.boj.stage16.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] t = new int[n];
        int[] p = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(t);

        for(int i=0;i<n;i++) {
            int sum =0;
            for(int j=0;j<=i;j++) {
                sum += t[j];
            }
            p[i] = sum;
        }

        int total = 0;
        for(int i=0;i<n;i++) {
            total += p[i];
        }

        System.out.println(total);
    }
}
