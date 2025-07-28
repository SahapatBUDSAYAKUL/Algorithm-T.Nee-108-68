import java.util.Scanner;

public class Tax {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Pls Enter salary :");
    int cash = scanner.nextInt();
    double tax = 0.10 ;
    double payment = cash*tax ;
    System.out.println ("Tax payment is  "+ payment) ;

    }
    }