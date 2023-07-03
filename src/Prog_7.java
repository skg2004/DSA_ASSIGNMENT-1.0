import java.util.Scanner;
public class Prog_7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int []ar = new int[n];
        for(int i =0;i<ar.length;i++) {
            ar[i]=sc.nextInt();
        }
        int max = ar[0];
        int min = ar[0];
        int max_count =0,min_count =0;
        int max_p=0;int min_p=0;
        for(int i =0;i<ar.length;i++) {
            if(ar[i]>max) {
                max=ar[i];
                max_p=i;
            }
            else if(ar[i]==max) {
                max_count++;
            }
            if(ar[i]<min) {
                min=ar[i];
            }
            else if(ar[i]==min) {
                min_count++;
                min_p=i;
            }
        }
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);
        System.out.println("maximum occurs for "+max_count+" times");
        System.out.println("minimum occurs for "+min_count+" times");
        System.out.println("maximm elements first positon "+max_p);
        System.out.println("minimum elements last positon "+min_p);
    }
}
