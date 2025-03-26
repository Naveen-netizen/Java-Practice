package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= (2 * n) - 1; row++) {
            int colsInRows=row>n?(2*n)-row:row;
            int spaceInRows=n-colsInRows;
            for (int s = 1; s <= spaceInRows; s++) {
                System.out.print(" ");
            }
                for (int col = 1; col <=colsInRows ; col++) {
                    System.out.print("* ");
                }
            System.out.println();

        }
    }
}
