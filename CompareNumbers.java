import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result;

        
        if (num1 > num2) {
            result = num1 - num2;
        } else if (num1 < num2) {
            result = num1 + num2;
        } else {
          
            System.out.println("Both numbers are equal.");
            return;
        }

        
        System.out.println("Result = " + result);
    }
}
