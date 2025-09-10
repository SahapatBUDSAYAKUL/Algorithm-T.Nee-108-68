import java.util.Scanner;

public class BMRCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าเพศ น้ำหนัก ส่วนสูง และอายุ
        System.out.print("Enter gender (M/F): ");
        String gender = sc.nextLine();
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        System.out.print("Enter age (years): ");
        int age = sc.nextInt();

        double bmr;

        // ตรวจสอบเพศแล้วคำนวณ
        if (gender.equalsIgnoreCase("M")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender.equalsIgnoreCase("F")) {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            System.out.println("Invalid gender input.");
            return;
        }

        // แสดงผลลัพธ์
        System.out.println("Your BMR is: " + bmr + " kcal/day");
    }
}
