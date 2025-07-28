import java.util.Scanner;

public class triangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Base:");
    int B = scanner.nextInt();
    System.out.print("Enter Length :");
    int L= scanner.nextInt();
    System.out.print("Enter Height:");
    int H = scanner.nextInt();
    System.out.print("Enter Weight :");
    int W = scanner.nextInt();
    double trian = 0.5*B*H ;
    int squa =W*L ;
    System.out.println("Area of Triangle is  " + trian +" Area of Square is " + squa);
    
    }
} 