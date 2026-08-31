import java.util.*;
public class Game23{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        if(m%n!=0){
            System.out.println(-1);
            return;
        }
        int divide =m/n;
        int count=0;
        while(divide%2==0){
            divide/=2;
            count++;
        }
        while(divide%3==0){
            divide/=3;
            count++;
        }
        if(divide!=1){
            System.out.println(-1);
            return;
        }
        System.out.println(count);
    }
}