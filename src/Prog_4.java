import java.util.Scanner;
public class Prog_4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char [] ch = str.toCharArray();
        for (int i =0;i<str.length();i++){
            for (int j =0;j<str.length();j++){
                for (int k =0;k<str.length();k++){
                    for (int l =0;l<str.length();l++){
                        for (int m =0;m<str.length();m++){
                            for (int n =0;n<str.length();n++){
                                if (i!=j && i!=k && i!=l && i!=m && i!=n && j!=k  && j!=l  && j!=m  &&  j!=n
                                        && k!=l &&  k!=m&&  k!=n && m!=n){
                                    System.out.println(ch[i]+" "+ch[j]+" "+ch[k]);
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}
