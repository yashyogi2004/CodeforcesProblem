import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String[] cards = sc.nextLine().split(" ");
        
        for (String card : cards) {
           if(card.charAt(0)==target.charAt(0) || card.charAt(1)==target.charAt(1)){
               System.out.println("YES");
               return;
           }
        }
        System.out.println("NO");
    }
}
