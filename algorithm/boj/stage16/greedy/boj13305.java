package algorithm.boj.stage16.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class boj13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        long[] edge = new long[n-1];
        long[] node = new long[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n - 1; i++) {
            edge[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }

        long ans = 0;
        long min_cost = node[0];
        for(int i=0;i<node.length-1;i++) {
            if(node[i]<min_cost){
                min_cost = node[i];
            }
            ans += edge[i] * min_cost;
        }

        System.out.println(ans);
    }
}
