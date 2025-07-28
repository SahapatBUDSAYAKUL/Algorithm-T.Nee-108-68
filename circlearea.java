import java.util.Scanner;

public class circlearea {
    public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Pls Enter radius :");
    int r = scanner.nextInt();
    final double PI = 3.14159 ;
    double area = PI*r*r ; // สูตรหาพื้นที่วงกลม
    System.out.println ("Area of circle is "+ area) ; // พื้นที่จริง

    }
    }
