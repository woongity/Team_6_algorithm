package algorithm.boj.stage14.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj14889 {
    static int n;
    static int ans = 987654321;
    static int[][] arr;
    static boolean[] isStart;
    static ArrayList<Integer> list = new ArrayList<>();

    static void func(int x,int k) {
        if(k==n/2) {
            int start = 0;
            int link = 0;

            for(int i=0;i<list.size();i++) {
                for(int j=i+1;j<list.size();j++) {
                    int a = list.get(i);
                    int b = list.get(j);
                    start += arr[a][b] + arr[b][a];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++) {
                    if(isStart[i] ||isStart[j]) continue;
                    link +=arr[i][j] + arr[j][i];
                }
            }

            ans = Math.min(ans, Math.abs(start - link));
            return;
        }

        for(int i=x;i<n;i++) {
            if(isStart[i]) continue;

            isStart[i] = true;
            list.add(i);
            func(i,k+1);

            list.remove(list.size() - 1);
            isStart[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        isStart = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        func(0,0);

        System.out.println(ans);
    }
}
