package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
      pattern(5);  
    }
    private static void pattern(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int colsInRows=n<row?2*n-row:row;
            int space=n-colsInRows;
            for (int s = 1; s <= space; s++) {
                System.out.print("  ");
            }
            for (int col = colsInRows; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= colsInRows; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
