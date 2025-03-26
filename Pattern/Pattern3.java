package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
