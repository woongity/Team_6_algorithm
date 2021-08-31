//package 하노이탑이동순서_11729;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    static void sol(int from ,int via,int to,int num) throws IOException {
        if(num==1) {
            bw.write(from + " "+ to);
            bw.newLine();
            return;
        }else{
            sol(from,to,via,num-1);
            bw.write(from + " "+ to);
            bw.newLine();
            sol(via,from,to,num-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println((int)Math.pow(2,num)-1);
        sol(1,2,3,num);
        bw.flush();
        bw.close();
    }
}
