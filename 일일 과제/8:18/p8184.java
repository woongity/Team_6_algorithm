import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p8184 {
    static ArrayList<String> list = new ArrayList<>();
    public static void remove(){
        int size= list.size();
        int sum = 0;
        for(int i=0;i<size;i++){
            sum+=list.get(i).length();
        }
        float avg = sum/size;
        for(int i=0;i<size;i++){
            System.out.println("i입니다: "+i);
            if(list.get(i).length()>avg){
                continue;
            }
            else{
                list.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n, m, ans = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            String a = sc.next();
            if(list.contains(a)){
                ans+=1;
            }
            else{
                ans+=3;
            }
            if(list.size()==n) {
                remove();
            }
            list.add(a);
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
