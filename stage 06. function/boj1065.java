package algorithm;

import java.util.Scanner;

public class boj1065 {
    static boolean check(int i) {
        String st = Integer.toString(i);

        int len = st.length();
        if(len==1) return true;

        int x = (st.charAt(1)-'0') - (st.charAt(0)-'0');
        for(int j=1;j<len;j++) {
            if((st.charAt(j)-'0')-(st.charAt(j-1)-'0')!=x)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        for(int i=1;i<=n;i++) {
            if(check(i))
                ans++;
        }
        System.out.println(ans);
    }
}
