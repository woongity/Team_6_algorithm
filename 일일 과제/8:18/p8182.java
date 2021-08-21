import java.util.Calendar;
import java.util.Scanner;

public class p8182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for(int i=a;i<=b;i++){
            if(i%c==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
