import java .util.Scanner;
public class amountPayto {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("amountTopay");
        int pay =sc.nextInt();
        int change = 1000-pay ;
        System.out.println ("Change is "+change) ;
        int fiveHundred = change/500 ;
        change = change%500 ;
        int oneHundred = change/100 ;
        change = change % 100 ;
        int fifTy = change/50;
        change = change % 50;
        int twenTy = change/20 ;
        change = change % 20 ;
        int tEncoin= change/10 ;
        change = change % 10 ;
        int fivecoin = change/5 ;
        change = change % 5 ;
        int tWocoin= change/2 ;
        change = change % 2 ;
        int oNecoin= change/1 ;
        change = change % 1 ;
        System.out.println ("Five hundred note " +fiveHundred+"Note(s)");
        System.out.println ("One hundred note " +oneHundred+"Note(s) ");
        System.out.println ("Fifty note " +fifTy+"Note(s) ");
        System.out.println ("Twenty note " +twenTy+"Note(s) ");
        System.out.println ("Ten coin "+tEncoin+" coins(s)");
        System.out.println ("Five coin "+fivecoin+" coins(s)");
        System.out.println ("two coin "+tWocoin+" coins(s)");
        System.out.println ("one coin "+oNecoin+" coins(s)");
    }
}