import java.util.Scanner;

public class Prog_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (n>1){
            n=n-2;
        }
        if (n==1){
            System.out.println("it is a odd number");
        }
        else
            System.out.println("It is even number");
    }
}
