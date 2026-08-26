import java.util.*;
public class C{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            int a =sc.nextInt();
            int b=sc.nextInt();
            int t=sc.nextInt();
            int count=0;
            while(a<=t && b<=t){
                if(a<=b){
                    a+=b;
                }else{
                    b+=a;
                }
                count++;
            }
             System.out.println(count);
        }
       
    }
}
