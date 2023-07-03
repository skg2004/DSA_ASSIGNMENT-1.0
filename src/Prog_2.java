import java.util.Scanner;
public class Prog_2 {
  static double BMI(double weight,double height){
        double bmi = weight/(height*height);
        return bmi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight");
        double W = sc.nextDouble();
        System.out.println("Enter Height");
        double H = sc.nextDouble();
        double category = BMI(W,H);
        if (category<18.5)
            System.out.println("underweight");
        else if (category>=18.5||category<=24.9)
            System.out.println("Normal Weight");
        else if (category>=25.0 || category<=29.9)
            System.out.println("OverWeight");
        else
            System.out.println("Obese");
    }
}