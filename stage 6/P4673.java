public class Main {
    public static int[] arr = new int[99999];
    public static int dn(int i){
        int count=i;
        if(i==10000){
            count+=i/10000;
            i=i%10000;
        }
        if(i>=1000){
            count+=i/1000;
            i=i%1000;
        }
        if(i>=100){
            count+=i/100;
            i=i%100;
        }
        if(i>=10){
            count+=i/10;
            i=i%10;
        }
        return count+=i;
    }
    public static void main(String[] args) {
        for(int i=1;i<=10000;i++){
            arr[dn(i)]=1;
            if(arr[i]==0){
                System.out.println(i);
            }
        }
    }
}
