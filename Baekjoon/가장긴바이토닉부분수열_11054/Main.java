package 가장긴바이토닉부분수열_11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] ups = new int[1001];
    static int[] downs= new int[1001];
    static int[] arr;
    static int num;

    static void lcs(){
        for(int i=1;i<=num;i++){
            ups[i] = 1;
            for(int j=i;j>=1;j--){
                if(arr[j] < arr[i] && ups[i]<ups[j]+1)
                    ups[i]=ups[j]+1;
            }
        }
    }
    static void back_lcs(){
        for(int i=num;i>=1;i--){
            downs[i]=1;
            for(int j=i;j<=num;j++){
                if(arr[i]>arr[j] && downs[j]+1>downs[i])
                    downs[i]=downs[j]+1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr= new int[1001];
        num = Integer.parseInt(br.readLine());
        String[] str= br.readLine().split(" ");
        for(int i=1;i<=num;i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }
        lcs();
        back_lcs();
        int max= ups[1]+downs[1]-1;
        for(int i=2;i<=num;i++){
            if(ups[i]+downs[i]-1>max) max= ups[i]+downs[i]-1;
        }
        System.out.println(max);
    }
}
