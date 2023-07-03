import java.util.Scanner;
public class Prog_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row ");
        int m = sc.nextInt();
        System.out.println("Enter no of cols ");
        int n = sc.nextInt();
        double [][]ar = new double[m][n];
        double sum =0;
        for(int i=0; i<m; i++) {
            for(int j =0; j<n; j++) {
                ar[i][j]= sc.nextDouble();
            }
        }
        for(int i=0; i<m; i++) {
            for(int j =0; j<n; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        for(int j =0;j<n;j++) {
            sum=0;
            for(int i =0;i<m;i++){
                sum+=ar[i][j];
            }
            System.out.println("summation of column no "+j+" is "+sum);
        }
    }
}
