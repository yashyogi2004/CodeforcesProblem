import java.util.*;
public class BoringAppartments{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            int length =0;
            int firstDigit=-1;
            while(a>0){
                int rem = a%10;
                if(firstDigit==-1){
                    firstDigit=rem;
                }
                length++;
                a/=10;
            }
            int ans = 0;
            ans+=(firstDigit-1)*10;
            ans+=length*(length+1)/2;
            System.out.print(ans);
            System.out.println();
        }
    }
}