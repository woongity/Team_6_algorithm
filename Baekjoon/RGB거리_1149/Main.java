package RGB거리_1149;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] rgb = new int[3];
        for(int i=0;i<3;i++){
            rgb[i] = 0;
        }
        for(int i=1;i<=num;i++){
            int r= sc.nextInt();
            int g = sc.nextInt();
            int b= sc.nextInt();
            int pr = rgb[0];
            int pg = rgb[1];
            int pb = rgb[2];
            rgb[0] = r+ min(pg,pb);
            rgb[1] = g+ min(pr,pb);
            rgb[2] = b+ min(pr,pg);
        }
        int ans = min(rgb[0],rgb[1]);
        ans = min(ans,rgb[2]);
        System.out.println(ans);
    }
}
