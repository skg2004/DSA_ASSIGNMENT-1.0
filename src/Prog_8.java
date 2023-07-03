import java.util.Scanner;
public class Prog_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row ");
        int m = sc.nextInt();
        System.out.println("Enter no of cols ");
        int n = sc.nextInt();
        int[][]ar = new int[m][n];
        int sum=0;
        for(int i=0; i<m; i++) {
            for(int j =0; j<n; j++) {
                ar[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m; i++) {
            for(int j =0;j<n; j++) {
                System.out.print(ar[i][j]+" ");
                sum+=ar[i][j];
            }
            System.out.println();
        }
        System.out.println("sum of elements of 2-D array is "+sum);
    }

}
