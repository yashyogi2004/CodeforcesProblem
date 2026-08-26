import java.util.*;
public class Passengers{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int MaxCap =0;
        int count=0;
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            count+=b-a;
            MaxCap = Math.max(MaxCap,count);
        }
        System.out.println(MaxCap);
    }
}