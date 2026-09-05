import java.util.*;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;

        // Last type has no restriction from the right
        long next = a[n - 1];
        ans += next;

        // Process from right to left
        for (int i = n - 2; i >= 0; i--) {

            if (next == 0) {
                break;
            }

            long current = Math.min(a[i], next - 1);

            ans += current;
            next = current;
        }

        System.out.println(ans);
    }
}