import java.util.*;

public class DonutShop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long first = -1;
            long second = -1;

            // Shop 1 cheaper
            if (a < c) {
                first = 1;
            } else if (a * (b + 1) < 2 * c) {
                first = b + 1;
            }

            // Shop 2 cheaper
            if (a * b > c) {
                second = b;
            }

            System.out.println(first + " " + second);
        }
    }
}


