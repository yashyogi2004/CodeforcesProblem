import java.util.*;
public class RepeatingCipher{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String s =sc.nextLine();
        int i=0;
        int temp=1;
        while(i<n){
            System.out.print(s.charAt(i));
            i+=temp;
            temp++;
        }
        sc.close();
    }
}