import java.util.Scanner ;
public class score {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Mid term =");
        double mid = sc.nextDouble();
         System.out.print("Final term = ");
        double fin = sc.nextDouble();
        double total = mid + fin ;
        if ( total < 50) {
            
            System.out.println("ไม่ผ่าน  ") ;}
        else {
        System.out.println(" ผ่าน  ") ;
        }


    }
}