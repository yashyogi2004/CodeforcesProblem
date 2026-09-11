import java.util.*;
public class PalindromicTwist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int l =0;
            int r=n-1;
            boolean isPalindromic =true;
            while(l<r){
                if (str.charAt(l) != str.charAt(r) &&
                        Math.abs(str.charAt(l) - str.charAt(r)) != 2) {
                    isPalindromic = false;
                    break;
                }
                l++;
                r--;
            }
            if(isPalindromic){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
