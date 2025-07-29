import java.util.Scanner ;
public class age {
    public static void main (String[] args ){
        System.out.println ("Please Enter Your Birth Year") ;
        Scanner scanner = new Scanner(System.in);
        int birth = scanner.nextInt();
        int year = 2026-birth;
        System.out.println("Your age is "+ year)  ;
    }
}