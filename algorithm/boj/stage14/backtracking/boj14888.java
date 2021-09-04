package algorithm.boj.stage14.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14888 {
    static int maxNum = -1000000000;
    static int minNum = 1000000000;
    static int n;
    static int[] arr;

    static void func(int tot, int k,int ad,int mi,int mu,int di) {
        if(k==n) {
            maxNum = Math.max(maxNum, tot);
            minNum = Math.min(minNum, tot);
            return;
        }

        if(ad>0) func(tot+arr[k],k+1,ad-1,mi,mu,di);
        if(mi>0) func(tot-arr[k],k+1,ad,mi-1,mu,di);
        if(mu>0) func(tot*arr[k],k+1,ad,mi,mu-1,di);
        if(di>0) func(tot/arr[k],k+1,ad,mi,mu,di-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        line = br.readLine().split(" ");
        int add,min,mul,div = 0;
        add = Integer.parseInt(line[0]);
        min = Integer.parseInt(line[1]);
        mul = Integer.parseInt(line[2]);
        div = Integer.parseInt(line[3]);


        func(arr[0],1,add,min,mul,div);

        System.out.println(maxNum+"\n"+minNum);
    }
}
