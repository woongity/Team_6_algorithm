import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1316 {
    public static boolean check(String a){

            int[] arr = new int[40];
            int b = a.length();
            arr[a.charAt(0) - 97] = 1;
            for (int i = 1; i<b; i++) {
                if (arr[a.charAt(i) - 97] == 101) {
                    return false;
                }
                if (a.charAt(i) != a.charAt(i - 1)) arr[a.charAt(i-1) - 97] = 101;
                else arr[a.charAt(i) - 97] += 1;
            }//한개씩 읽어나가면서 다른 문자가 나오면 그 이전 문자에 해당하는 인덱스를 101로 만든다.
            //그리고 계속 읽어 나가다가 101이 인덱스인 문자를 만나면 바로 false를 반환한다.
            return true;
    }
    public static void main(String[] args) throws IOException {
        int count = 0;

            int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        for (int i = 0; i<num; i++) {
                String a= br.readLine();
                if (check(a))count++;
            }
        System.out.println(count);
        }
    }

