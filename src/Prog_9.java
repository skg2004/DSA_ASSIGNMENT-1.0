import java.util.Scanner;
public class Prog_9 {
    public static double sum_major_Diagonal(double[][]ar,int m,int n) {
        Scanner obj = new Scanner(System.in);
        double sum=0;
        for(int i=0; i<m; i++) {
            for(int j =0; j<n; j++) {
                ar[i][j]= obj.nextDouble();
            }
        }
        for(int i=0; i<m; i++) {
            for(int j =0; j<n; j++) {
                System.out.print(ar[i][j]+" ");
                if(i==j) {
                    sum+=ar[i][j];
                }
            }
            System.out.println();
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row ");
        int m = sc.nextInt();
        System.out.println("Enter no of cols ");
        int n = sc.nextInt();
        double[][]ar = new double[m][n];
        double ans = sum_major_Diagonal(ar,m,n);
        System.out.println("sum of the elements in the major diagonal is "+ans);
    }
}
