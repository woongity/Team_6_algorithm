package algorithm.boj.stage07.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] kro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0;i<kro.length;i++) {
            input = input.replace(kro[i],"a");
        }

        System.out.println(input.length());
    }
}