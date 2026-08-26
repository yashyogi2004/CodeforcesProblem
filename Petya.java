import java.util.*;
public class Petya {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            temp[arr[i]]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(temp[i]+" ");
        }
        sc.close();
    }
    
}
