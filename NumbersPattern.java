import java.util.Scanner;

public class NumbersPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        pattern(n);

    }

    public static void pattern(int n) {
        int odd = 1;
        int even = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print(even + " ");
                    even += 2;
                } else {
                    System.out.print(odd + " ");
                    odd += 2;
                }

            }
            System.out.println();
        }
    }
}
