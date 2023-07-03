import java.util.Scanner;

public class Prog_4_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char [] ch = str.toCharArray();
        for (int i =0;i<str.length();i++) {
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < str.length(); k++) {
                    if (i!=j && i!=k && j!=k){
                        System.out.println(ch[i]+" "+ch[j]+" "+ch[k]);
                }
            }
        }
         }
    }
}