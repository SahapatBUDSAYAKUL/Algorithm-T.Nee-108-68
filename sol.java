import java.util.Scanner ;

public class sol  {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in) ;
    System.out.println ("Enter first number");
    int num1 = scanner.nextInt();
    System.out.println ("Enter second number");
    int num2 = scanner.nextInt();
    int plus = num1+num2 ;
    int neg = num1-num2 ;
    double mul = num1* num2 ;
    double divi =num1/num2 ;
    System.out.println("Possitive is "+plus+" Negative is "+neg+" Multiple is "+mul+" Division is "+divi);

    }
}