package 동전0_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int a,b;
        int[] arr= new int[11];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b= Integer.parseInt(str[1]);
        for(int i=1;i<=a;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count=0;
        for(int i=a;i>=1;i--){
            count+= b/arr[i];
            b= b%arr[i];
        }
        System.out.println(count);
    }
}
