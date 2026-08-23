import java.util.*;

public class TheNewYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(Math.max(A, Math.max(B, C)) - Math.min(A, Math.min(B, C)));
    }
}