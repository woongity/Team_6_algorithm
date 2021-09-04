package n과M3_15651;

import javax.swing.*;
import java.io.*;

public class Main {
    static int[] arr = new int[9];
    static BufferedWriter bw ;
    static BufferedReader br;

    static int[] chosen = new int[9];
    static int n,m;
    public static void sol(int count) throws IOException {
        if(count==m){
            for(int i=0;i<count;i++){
                bw.write(chosen[i]+" ");
            }
            bw.newLine();
            return ;
        }
        else{
            for(int i=0;i<n;i++){
                chosen[count] = arr[i];
                sol(count+1);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        sol(0);
        bw.close();
    }
}
