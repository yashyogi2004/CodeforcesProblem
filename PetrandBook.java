import java.util.*;

public class PetrandBook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s =sc.nextLine();
        int arr[] = new int[7];
        String str[] = s.split(" ");
        for(int i=0;i<7;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int count=0;
        while(true){
            
            for(int i=0;i<7;i++){
                count+=arr[i];
            if(count>=n){
                System.out.println(i+1);
                return;
            }
        }
    }
    }    
}
