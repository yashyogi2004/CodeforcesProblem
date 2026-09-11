import java.util.*;

class Solution {

    public boolean isCorrect(String pass, String hash) {

        int n = pass.length();
        int m = hash.length();

        if (n > m) {
            return false;
        }

        int[] passwordFreq = new int[26];

        // Frequency of password
        for (char c : pass.toCharArray()) {
            passwordFreq[c - 'a']++;
        }

        // Try every substring of hash having length n
        for (int i = 0; i <= m - n; i++) {

            int[] hashFreq = new int[26];

            for (int j = i; j < i + n; j++) {
                hashFreq[hash.charAt(j) - 'a']++;
            }

            if (Arrays.equals(passwordFreq, hashFreq)) {
                return true;
            }
        }

        return false;
    }
}

public class SuffleHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String pass = sc.next();
            String hash = sc.next();

            Solution solution = new Solution();

            System.out.println(
                    solution.isCorrect(pass, hash) ? "YES" : "NO"
            );
        }

        sc.close();
    }
}