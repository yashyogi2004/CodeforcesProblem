import java.util.*;


public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long ans = (n*n*n+5*n)/6;

        System.out.println(ans);
    }
}
