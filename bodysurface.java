import java.util.Scanner;
public class bodysurface {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("enter wide ");
        double w = scanner.nextDouble();
        System.out.print ("enter length ") ;
        double l = scanner.nextDouble();
        double bsf = (w*l)/360 ;
        System.out.println ("area of bodysurface is " +bsf) ;

    }

}