import java.util.Scanner;
public class Prog_3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int n1 =n;
        int sum  =0;
        int prdct =1;
        while (n!=0){
            int r = n%10;
            n=n/10;
            sum=sum+r;
            prdct=prdct*r;
        }
        if (sum==prdct)
            System.out.println(n1+" is a spy number");
    }
}
