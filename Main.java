import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            // Max heap
            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            // Keep 1 aside until the final operation
            pq.add(2);

            for (int i = 3; i <= n; i++) {
                pq.add(i);
            }

            StringBuilder ans = new StringBuilder();

            // Merge the two largest numbers
            while (pq.size() > 1) {
                int a = pq.poll();
                int b = pq.poll();

                int c = (a + b + 1) / 2;

                ans.append(a).append(" ").append(b).append('\n');

                pq.add(c);
            }

            // Finally combine with 1
            int x = pq.poll();

            ans.append(1).append(" ").append(x).append('\n');

            System.out.println(2);
            System.out.print(ans);
        }
    }
}