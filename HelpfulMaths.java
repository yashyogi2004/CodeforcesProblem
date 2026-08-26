import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='+'){
                continue;
            }
            list.add(c);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(char c:list){
            sb.append(c);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
