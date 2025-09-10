import java.util.Scanner ;
public class Triangle {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number =sc.nextInt();
        if (number ==1 ) {
        System.out.print("Enter a height: ");
        int heightT = sc.nextInt();
        System.out.print("Enter a base: ");
        int baseT = sc.nextInt();
        int Triangle = (baseT*heightT)/2;
        System.out.println("พื้นที่ของสาทเหลี่ยม" +Triangle);
        } else {
        System.out.print("Enter a weight in kilogram ");
        double weight = sc.nextDouble();
        System.out.print("Enter a height in meters ");
        double height = sc.nextDouble();
        double BMI = weight/(height*height );
        System.out.println("Your BMI for weight ="+weight+" kg. and height ="+height+" meters is :"+BMI );

        }
    }
}