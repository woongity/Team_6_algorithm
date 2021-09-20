package algorithm.boj.stage16.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        //종료시간을 기준으로 오름차순, 종료시간이 같은 경우 시작시간을 기준으로 오름차순
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int t = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(t<=time[i][0]) {
                t = time[i][1];
                ans++;
            }
        }

        System.out.println(ans);


    }
}
