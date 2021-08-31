package 터렛_1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0;i<testCase;i++){
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int r1 = Integer.parseInt(str[2]);

            int x2 = Integer.parseInt(str[3]);
            int y2 = Integer.parseInt(str[4]);
            int r2 = Integer.parseInt(str[5]);

            double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

            if(Math.abs(r2-r1)<dis && r1+r2>dis){
                System.out.println(2);
            }
            else if(dis == r1+r2){
                System.out.println(1);
            }
            else if(dis == Math.abs(r2-r1) && dis!=0){
                System.out.println(1);
            }
            else if(dis<Math.abs(r2-r1)){
                System.out.println(0);
            }
            else if(dis>r1+r2){
                System.out.println(0);
            }
            else if(dis==0 && r1==r2){
                System.out.println(-1);
            }
        }
    }
}
