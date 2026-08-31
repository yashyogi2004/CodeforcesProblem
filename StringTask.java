import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='y'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U'||c=='Y'){
                continue;
            }else{
                sb.append('.');
                sb.append((new String()+c).toLowerCase());
            }
        }
        System.out.println(sb.toString());
    }
}
