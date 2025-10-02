import java.util.Scanner ;
public class prac01 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  area you want to solv (Rectangle , Circle , Square)      ");
        String Area = sc.nextLine();

        if (Area.equalsIgnoreCase("Square")){
            System.out.print("enter side");
            int side = sc.nextInt ();
            int square = side*side ;
            System.out.println ("Area of Square is "+ square  );

        } else if (Area.equalsIgnoreCase("Rectangle")) {
            System.out.print("enter wide");
            int wide = sc.nextInt();
            System.out.print("enter length");
            int length = sc.nextInt();
            int rectangle = wide*length ;
            System.out.println ("Area of Rectangle is "+ rectangle  );
            
        } else if (Area.equalsIgnoreCase("Circle")){
            System.out.print("enter R  ");
            double r = sc.nextDouble();
            double circle = 3.14*r*r ;
            System.out.println ("Area of Circle is "+ circle  );
        } else 
            System.out.println ("This menu doesn't exist");


    }
}