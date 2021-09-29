package q15596_정수N개의합;

public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) ans += a[i];
        
        return ans;
    }
}