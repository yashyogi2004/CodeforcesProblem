import java.util.Scanner;

public class BeautifulMatrix {
    public static int solve(int matrix[][], int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 1){
                    return Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int row =5;
        int col =5;
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = solve(matrix, row, col);
        System.out.println(result);
    }
}
