package algorithm;

import java.util.Scanner;

public class ps020820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int stage = 0;
        boolean creep = false;
        int cal = 0;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='#') {
                creep = !creep;
            } else if (str.charAt(i) == '(') {
                stage++;
                if(creep) cal += stage * 2;
                else cal += stage;
            } else {
                if (creep) cal += stage * 2;
                else cal += stage;
                stage--;
            }
        }

        System.out.println(cal);
    }
}
