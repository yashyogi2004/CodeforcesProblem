import java.util.*;
public class Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  m= sc.nextInt();
        int n= sc.nextInt();
        char[][] arr = new char[m][n];
        int count=0;
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
                if(i%2==0){
                    arr[i][j]='#';
                }else{
                    arr[i][j]='.';
                    if(count%2==0 && j==n-1){
                        arr[i][j]='#';
                    }else if(count%2!=0 && j==0){
                        arr[i][j]='#';
                    }
                }
            }
            if(i%2!=0){
                count++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }   
    }    
}
