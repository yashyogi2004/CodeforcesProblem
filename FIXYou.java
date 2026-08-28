import java.util.*;
public class FIXYou {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            sc.nextLine();
            char [][] arr=new char[m][n];
            int count=0;
            for(int j=0;j<m;j++){
                String s=sc.nextLine();
                for(int k=0;k<n;k++){
                    arr[j][k]=s.charAt(k);
                } 
            }
            for(int j=0;j<m-1;j++){
                if(arr[j][n-1]=='R'){
                    count++;
                }
            }
            for(int j=0;j<n-1;j++){
                if(arr[m-1][j]=='D'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }    
}
