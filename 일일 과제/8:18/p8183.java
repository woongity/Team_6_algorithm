import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class p8183 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            int score = sc.nextInt();
            scores.add(score);
        }
        System.out.println("done");
        int ans = 0;
        sc.nextLine();
        String firstShot = sc.nextLine();
        String nextShot = sc.nextLine();
        for(int i=0;i<num;i++){
            if(firstShot.charAt(i)==nextShot.charAt(i) && firstShot.charAt(i)=='O'){
                ans+=scores.get(i);
            }
        }
        System.out.println(ans);
    }
}
