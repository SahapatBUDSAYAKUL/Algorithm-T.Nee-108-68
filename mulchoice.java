import java.util.Scanner;
public class mulchoice {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Age ");
        int age = sc.nextInt ();

        if (age > 10 ) {
        System.out.println ("Take 2 teaspoons");    
        }
        else if (age > 3) { 
        System.out.println ("Take 1 teaspoons");
        }
        else if (age > 1) {
            System.out.println("Take 1/2 teaspoons");
        }
        else  if (age > 0 ) {
            System.out.println ("Do not take medicine");
        }
        else  System.out.println ("pls enter number again Zero and Negative number is age");
    }
}