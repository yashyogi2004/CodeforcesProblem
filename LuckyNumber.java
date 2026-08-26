import java.util.*;
public class LuckyNumber {    
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            if(n==7||n==4){
                System.out.println("NO");
                return;
            }
            while(n>0){
                long d = n%10;
                if(d==4 || d==7){
                    n/=10;
                }else{
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }    
}
