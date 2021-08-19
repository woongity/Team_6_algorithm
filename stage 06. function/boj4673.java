package algorithm;

public class boj4673 {
    static boolean[] nums = new boolean[10001];
    static void selfNum() {
        for(int i=1;i<=10000;i++) {
            String str = Integer.toString(i);
            int sum = i;
            for(int j=0;j<str.length();j++) {
                sum += str.charAt(j) - '0';
            }
            //System.out.println(sum);
            if (sum<=10000 && nums[sum]==false ) {
                nums[sum] = true;
            }
        }
    }
    public static void main(String[] args) {
        selfNum();
        for(int i=1;i<=10000;i++) {
            if(nums[i]==false) System.out.println(i);
        }
    }
}
