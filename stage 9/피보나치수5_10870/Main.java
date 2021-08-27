package 피보나치수5_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int fib(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
             return 1;
        }
        else if(num==2){
            return 1;
        }
        else{
            return fib(num-1)+fib(num-2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int ans = fib(a);
        System.out.println(ans);
    }
}
