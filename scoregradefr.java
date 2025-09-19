import java.util.Scanner ;
public class scoregradefr {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Name ");
        String name = sc .nextLine();
        System.out.print("Enter score ");
        int score =sc .nextInt();
        if (score < 0 ){
            System.out.println("์Nothing");}
        else if (score >= 80) {
            System.out.println("Result ");
            System.out.println("Name "+name);
            System.out.println("Score "+score);
            System.out.println("Your grade is A");
            
        }
        else if (score >= 70) {
            System.out.println("Result ");
            System.out.println("Name "+name);
            System.out.println("Score "+score);
            System.out.println("Your grade is b");
            }
        else if (score >= 60) {
            System.out.println("Result ");
            System.out.println("Name "+name);
            System.out.println("Score "+score);
            System.out.println("Your grade is c");
            }
        else if (score >= 50) {
            System.out.println("Result ");
            System.out.println("Name "+name);
            System.out.println("Score "+score);
            System.out.println("Your grade is d");
            }

        else {
               System.out.println("Result ");
            System.out.println("Name "+name);
            
            System.out.println("Your Grade is E"); 
             
             }

    }
}