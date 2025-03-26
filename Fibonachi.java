public class Fibonachi {
    public static void main(String[] args) {
        int ans=fibo2(48);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n>0&&n<3){
            return n-1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int fibo2(int n){
        int first=0;
        int second=1;
        if(n==1){
            return first;
        }
        if(n==2){
            return second;
        }
        int fibo=0;
        for (int i = 0; i < n-2; i++) {
            fibo=second+first;
            first=second;
            second=fibo;
        }
        return fibo;
    }
}
