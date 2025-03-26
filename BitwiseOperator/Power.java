package BitwiseOperator;

public class Power {
    public static void main(String[] args) {
        int power = 2;
        int base = 3;
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            power = power >> 1;
            base = base * 3;

        }
        System.out.println(ans);
    }
}
