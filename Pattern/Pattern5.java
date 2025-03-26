package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= (2 * n) - 1; row++) {
            int colsInRows = row > n ? (2 * n) - row : row;
            for (int col = 1; col <= colsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
