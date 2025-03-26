package Recursion;

public class Message {
    public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
        message(1);
       } 
    }
    static void message(int n){
        if(n == 10000){
            System.out.println(10000);
            return;
        }
        System.out.println(n);
        message(n+1);
    }
}
