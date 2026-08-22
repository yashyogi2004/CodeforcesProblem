import java.util.*;
public class ChewbaccaNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '9' && i == 0) {
                sb.append(c);
            } else {
                int digit = c - '0';
                int transformedDigit = Math.min(digit, 9 - digit);
                sb.append(transformedDigit);
            }
        }
        System.out.println(sb.toString());
    }  
}