package 가장긴증가하는부분수열_11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[1001];
        int[] dp = new int[1001];
        dp[0]= 1;
        dp[1] =2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int i=1;i<num;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    if(dp[j]>max) {
                        max=dp[j];
                    }
                }
            }
            dp[i] = max+1;
        }
        int max = 0;
        for(int i=0;i<num;i++){
//            System.out.println(dp[i]);
                        if(max<dp[i]) max = dp[i];
        }
        System.out.println(max);
    }
}
