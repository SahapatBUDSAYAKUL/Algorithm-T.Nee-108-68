import java .util.Scanner;
public class notenoughMoney {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("productPrice");
        int price =sc.nextInt();
        System.out.print("productamount");
        int amount =sc.nextInt();
        int pay = amount*price ;
        int total = 1000-pay;
        if (total < 0) {
        System.out.println("Not enough money!! ");
        }
        else {
        System.out.println("Your Change is "+ total);
        }
    }
}