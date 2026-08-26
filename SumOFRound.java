import java.util.*;
public class SumOFRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int steps = 0;
            List<Integer> roundNumbers = new ArrayList<>();
            int number = 1;
            while (n > 0) {
                int lastDigit = n % 10;
                if (lastDigit != 0) {
                    steps++;
                    roundNumbers.add( lastDigit*number);
                }
                n /= 10;
                number *= 10;
            }
            System.out.println(steps);
            for (int i = 0; i < roundNumbers.size(); i++) {
                System.out.print(roundNumbers.get(i) + " ");
            }
        }
    }
}
