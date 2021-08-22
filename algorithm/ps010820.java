package algorithm;

import java.util.Scanner;

public class ps010820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minNumber = 100000;
        boolean noOdd = true;
        int sum = 0;

        for(int i=0;i<7;i++)
        {
            int x = sc.nextInt();
            if(x%2==0) continue;

            if(noOdd) noOdd = false;
            sum += x;
            if(minNumber>x) minNumber = x;
        }

        if(noOdd)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(minNumber);
        }
    }
}