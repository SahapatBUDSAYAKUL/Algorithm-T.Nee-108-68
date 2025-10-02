import java.util.Scanner ;
public class prac02 {
public static void main (String [] args ){
    Scanner sc = new Scanner(System.in);
    
    System.out.print ("Enter of your work type (Fulltime , Contract , Parttime)    ");
    String type = sc.nextLine ();
    

    if (type.equalsIgnoreCase("Fulltime")){
        System.out.print ("Enter your work hour");
    int hour = sc.nextInt ();
        int fulltime =hour * 200 ;
        System.out.println ("Your OT is    "+ fulltime);

    } else if (type.equalsIgnoreCase("Contract")){
        System.out.print ("Enter your work hour");
    int hour = sc.nextInt ();
        int contract = hour * 150 ;
        System.out.println("Your Ot is    " +contract);

    } else if (type.equalsIgnoreCase("Parttime")) {
        System.out.print ("Enter your work hour");
    int hour = sc.nextInt ();
        int parttime = hour * 100 ;
        System.out.println ("Your OT is    " + parttime);
    } else
        System.out.println ("You select wrong menu");
    

}
}