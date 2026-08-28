
import java.util.*;

public class ErasingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == '1') {

                    int k = j + 1;

                    // Find the next '1'
                    while (k < s.length() && s.charAt(k) != '1') {
                        k++;
                    }

                    // Count zeroes between two 1s
                    if (k < s.length()) {
                        count += k - j - 1;
                    }

                    j = k - 1;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}


