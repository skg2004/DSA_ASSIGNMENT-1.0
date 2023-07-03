import java.util.Scanner;

public class Prog_5_1 {
    public static int sum_of_digits(int n ){
        int sum =0;
        while(n>0){
            int r = n%10;
            sum+=r;
            n=n/10;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int res = sum_of_digits(n);
       if ( res>9) {
           int ans = sum_of_digits(res);
           System.out.println(ans);
       }
       else
           System.out.println(res);
    }
}