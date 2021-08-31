class Test {
    long sum(int[] a){
        long sum=0;
        int len = a.length;
        for(int i=0;i<len;i++){
            sum+=a[i];
        }
        return sum;
    }
}
