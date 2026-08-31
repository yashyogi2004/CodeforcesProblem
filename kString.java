import java.util.*;

public class kString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder temp = new StringBuilder();

        // Build one k-th part
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            char key = e.getKey();
            int value = e.getValue();

            if (value % k != 0) {
                System.out.println("-1");
                return;
            }

            for (int i = 0; i < value / k; i++) {
                temp.append(key);
            }
        }

        // Repeat k times
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            ans.append(temp);
        }

        System.out.println(ans);
    }
}