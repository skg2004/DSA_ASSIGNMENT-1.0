
import java.util.Scanner;
public class Prog_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n>2){
            count++;
            n=n/2;
        }
        System.out.println(count);
    }
}