import java.util.*;

public class Polygon{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            String st = sc.next();
            if(st.equals("Tetrahedron")){
                count += 4;
            }else if(st.equals("Cube")){
                count += 6; 
        }else if(st.equals("Octahedron")){
                count += 8;
            }else if(st.equals("Dodecahedron")){
                count += 12;
            }else if(st.equals("Icosahedron")){
                count += 20;
            }
        }
        System.out.println(count);
    }
}