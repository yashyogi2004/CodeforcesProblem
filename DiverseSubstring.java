import java.util.Scanner;

public class DiverseSubstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str =sc.nextLine();

        for(int i=0;i<str.length();i++){
            StringBuilder ans =new StringBuilder();
            int freq[]= new int[26];
            int maxFreq = Integer.MIN_VALUE;
            for(int j=i;j<str.length();j++){
                char c=str.charAt(j);
                freq[c-'a']++;
                maxFreq =Math.max(maxFreq,freq[c-'a']);
                ans.append(c);
                if(maxFreq<=(j-i+1)/2) {
                    System.out.println("YES");
                    System.out.println(ans);
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
