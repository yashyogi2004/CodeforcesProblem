import java.util.Scanner;
import java.math.*;
public class Draemon {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int low=n/2;
        if(n%2!=0){
            low = (n/2)+1;
        }
        int high =n;
        for(int i=(int)low;i<=high;i++){
            if(i%m==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
        sc.close();
    }
}
