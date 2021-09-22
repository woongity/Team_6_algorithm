package 주유소_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        long[] price_per_meter = new long[100001];
        long[] meters = new long[100001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        String[] meterStr= br.readLine().split(" ");
        String[] oilPrice = br.readLine().split(" ");
        for(int i=0;i<num;i++){
            price_per_meter[i] = Long.parseLong(oilPrice[i]);
        }
        for(int i=0;i<num-1;i++){
            meters[i] = Long.parseLong(meterStr[i]);
        }
        long ans = 0;
        long greedy = 1000000001;
        for(int i=0;i<num-1;i++){
            if(price_per_meter[i]<greedy){
                greedy = price_per_meter[i];
            }
            ans+=greedy*meters[i];
        }
        System.out.println(ans);
    }
}
