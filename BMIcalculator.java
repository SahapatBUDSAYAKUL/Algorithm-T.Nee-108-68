import java.util.Scanner ;
public class BMIcalculator {
    public static void main (String [] args ){
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter weight : ");
    double w =scanner.nextDouble();
    System.out.print("enter height : ");
    double h =scanner.nextDouble();
    double BMi= w/(h*h) ;
    System.out.println(" BMI is "+BMi  );
    }
}