package 소수_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m =Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int k = (int)Math.ceil(Math.sqrt(n));
        for(int i=m;i<=n;i++){
            check[i] = false;
        }
        check[1] = true;
        for(int i=2;i<=k;i++){
            int num = i;
            for(int j=2;j<n;j++){
                if(num*j > n ) break;
                check[num*j] = true;
            }
        }
        int min = n+1;
        int sum= 0;
        for(int i=m;i<=n;i++){
            if(!check[i]) {
                if(min>i) min = i;
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
