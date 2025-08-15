import java.util.Scanner;

public class discount {
    public static void main (String [] args ) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter price");
        double p = sc.nextDouble();
        System.out.print("enter total dress ");
        double t = sc.nextDouble();
        System.out.print("enter discount");
        double d = sc.nextDouble();
        double c = p*t ;
        double b =c*(d/100) ;
        double n = c-b ;
        System.out.println("total cost = "+c);
        System.out.println("discount" +b);
        System.out.println("Net pay "+ n);
    }
}