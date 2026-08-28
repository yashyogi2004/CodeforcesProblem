import java.util.*;

public class Pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int level = 0;
        int cubesUsed = 0;
        int cubesInLevel = 0;

        while (true) {
            level++;
            cubesInLevel += level;

            if (cubesUsed + cubesInLevel > n) {
                level--;
                break;
            }

            cubesUsed += cubesInLevel;
        }

        System.out.println(level);
    }
}