import java.util.Scanner;

public class tempeturestatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();

        System.out.println("Temperature: " + temp + "C");

        if (temp < 20) {
            System.out.println("Status: Cold");
        } else if (temp <= 35) {
            System.out.println("Status: Normal");
        } else {
            System.out.println("Status: Hot");
        }

        
    }
}
