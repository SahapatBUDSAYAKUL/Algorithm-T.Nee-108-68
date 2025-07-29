import java.util.Scanner;
public class lxw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght");
        int l = scanner.nextInt ();
       
        System.out.println("Enter weight");
        int w = scanner.nextInt ();
        int rect = l*w ;
        System.out.println("Area of Retangle is "+rect);

    }
}