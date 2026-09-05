
import java.util.*;

public class LineWorld {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t =sc.nextInt();
        int arr []= new int[n];
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cell =1;
        while(cell<n){
            cell+=arr[cell];
            if(cell==t){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
