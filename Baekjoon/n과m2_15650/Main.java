package n과m2_15650;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[9];
    static int[] isVisited = new int[9];
    static int[] chosen = new int[9];
    static int n,m;
    public static void sol(int start, int count){
        if(count==m){
            for(int i=0;i<count;i++){
                System.out.print(chosen[i]+" ");
            }
            System.out.println();
        }
        else{
            for(int i=start;i<n;i++){
                chosen[count] = arr[i];
                sol(i+1,count+1);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        sol(0,0);
    }
}
