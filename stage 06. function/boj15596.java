package algorithm;

import java.util.Scanner;

public class boj15596 {
    static long sum(int[] a) {
        int size = a.length;
        long ans = 0;
        for(int i=0;i<size;i++) {
            ans+=a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a));
    }
}
