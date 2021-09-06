package 연산자끼워넣기_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int[] list = new int[12];
    public static char[] arr = new char[12];

    static int max= -1000000001;
    static int min = 1000000001;
    static int n ;
    public static void swap(int from,int to){
        char temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
    public static void calc(int start, int count){
        if(count==n-1){
            int ans =list[0];
            for(int i=0;i<n-1;i++){
                if(arr[i]=='+'){
                    ans += list[i+1];
                }else if(arr[i]=='-'){
                    ans-=list[i+1];
                }else if(arr[i]=='*'){
                    ans*=list[i+1];
                }else if(arr[i]=='/'){
                    ans/=list[i+1];
                }
            }
            if(ans<min) min=ans;
            if(ans>max) max= ans;
        }
        else{
            for(int i=start;i<n-1;i++){
                swap(start,i);
                calc(start+1,count+1);
                swap(start,i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] str= br.readLine().split(" ");
        for(int i=0;i<n;i++){
            list[i] = Integer.parseInt(str[i]);
        }
        String[] sign = br.readLine().split(" ");
        char[] chars = {'+','-','*','/'};
        int count = 0;
        for(int i=0;i<4;i++) {
            int num = Integer.parseInt(sign[i]);
            for (int j = 0; j < num; j++) {
                arr[count+j] = chars[i];
            }
            count+=num;
        }
        calc(0,0);
        System.out.println(max);
        System.out.println(min);
    }
}
