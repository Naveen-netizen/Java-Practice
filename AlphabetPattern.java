import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        pattern(n);
    }

    public static void pattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n && n < 9; i++) {
            for (int j = 0; j < i; j++) {
                if (ch > 'Z') {
                    break;
                }
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(Character.toLowerCase(ch) + " ");
                    } else {
                        System.out.print(ch + " ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(ch + " ");
                    } else {
                        System.out.print(Character.toLowerCase(ch) + " ");
                    }
                }
                ch++;
            }
            System.out.println();
        }
    }
}
