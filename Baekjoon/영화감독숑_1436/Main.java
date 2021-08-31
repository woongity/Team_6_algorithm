package 영화감독숑_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        int count =0;
        int start = 665;
        while(count!=num){
            start++;
            if(Integer.toString(start).contains("666")){
                count++;
            }
        }
        System.out.println(start);
    }
}
