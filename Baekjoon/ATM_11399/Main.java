package ATM_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        String[] str = br.readLine().split(" ");
        for(int i=0;i<num;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        int sum =0;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                sum+=arr[j];
            }
        }
        System.out.println(sum);
    }
}
