import java.util.*;

public class RainyDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int d = 0; d < n; d++) {

            boolean valid = true;

            // Check x days before
            for (int j = Math.max(0, d - x); j < d; j++) {
                if (a[d] > a[j]) {
                    valid = false;
                    break;
                }
            }

            // Check y days after
            if (valid) {
                for (int j = d + 1; j <= Math.min(n - 1, d + y); j++) {
                    if (a[d] > a[j]) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                System.out.println(d + 1);
                return;
            }
        }
    }
}