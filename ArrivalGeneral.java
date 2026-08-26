import java.util.*;
public class ArrivalGeneral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int minIndex = -1;
        int max= Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
                minIndex=i;
            }
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        int count =0;
        if(maxIndex<minIndex){
            count = maxIndex + (n-1-minIndex);
        }else{
            count = maxIndex + (n-1-minIndex) - 1;
        }
        System.out.println(count);
    }
}