package n과M4_15652;

import java.io.*;

public class Main {
    static int n,m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] chosen = new int[9];
    static void sol(int count) throws IOException {
        if(count==m){
            for(int i=0;i<m;i++){
                bw.write(chosen[i]+" ");
            }
            bw.newLine();
        }
        else{

            for(int i = (count==0)? 1:chosen[count-1] ;i<=n;i++){
                chosen[count] = i;
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
        sol(0);
        bw.flush();
    }
}
