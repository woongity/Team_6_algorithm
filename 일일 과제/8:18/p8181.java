public class p8181 {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=5;j>=1;j--) {
            for (int i = j; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
