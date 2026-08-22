import java.util.*;
public class Bit{
    static int  bit(String exp){
       if(exp.equals("++X") || exp.equals("X++")){
              return 1;
       }
       else if(exp.equals("--X") || exp.equals("X--")){
                return -1;
         }
         else{
                return 0;
       }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            String exp= sc.next();
            ans+=bit(exp);
        }
        System.out.println(ans);
    }
}