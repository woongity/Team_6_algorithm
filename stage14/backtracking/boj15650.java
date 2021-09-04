package stage14.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj15650 {

    static StringBuilder sb;
    static int n,m;
    static boolean[] isused;
    static ArrayList<Integer> list = new ArrayList<>();

    static void func(int x,int k) {
        if (k == m) {
            for (int e : list) {
                sb.append(e + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=x+1;i<=n;i++) {
            if(isused[i]) continue;

            list.add(i);
            isused[i]=true;
            func(i,k + 1);
            isused[i] = false;
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        isused = new boolean[n + 1];

        func(0,0);

        System.out.println(sb.toString());
    }
}