import java.util.Scanner;
public class celsius {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter fahrenhei");
        double f = sc.nextDouble();
        double c =(5.0/9.0)*(f-32) ;
        System.out.println(" celsius is "+c);
    }
    }