import java.awt.*;
import java.util.*;
public class CapsLock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        if(s.equals(s.toUpperCase())){
            String ans =s.toLowerCase();
            System.out.println(ans);
        }else if(s.substring(0,1).equals(s.substring(0,1).toLowerCase()) && s.substring(1,s.length()).equals(s.substring(1,s.length()).toUpperCase())){
            String ans =s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
            System.out.println(ans);
        }else{
            System.out.println(s);
        }
    }
}
