package algorithm.boj.stage16.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int[] coins = new int[n + 2];

        for(int i=0;i<n;i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        for(int i=n-1;i>=0;i--) {
            if(coins[i]>k) continue;
            int x = k / coins[i];
            k = k - (x * coins[i]);
            ans += x;
            if(k==0) break;
        }

        System.out.println(ans);
    }
}
