package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
      pattern(5);  
    }
    private static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            int s=n-row;
            for (int space = 1; space <= s; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
