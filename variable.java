public class variable {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่ใช้เก็บค่าของขนาดของเสื้อผ้า ซึ่งมีขนาดเป็น s, m หรือ l
        char clothingSize = 's';// สามารถเป็น 's','m' หรือ 'l'

        //1.2 ตัวแปรที่ใช้เก็บค่าของจำนวนคนทีเข้าชมเว็บไซต์
        int websiteVisitors = 0;// จำนวนคนที่เข้าชมเว็บไซต์
        
        //1.3 ตัวแปรที่ใช้เกรดของนักศึกษา ( 'A','B','C','D','E')
        char studentGrade = 'A';//  'A','B','C','D' หรือ 'E'
        
        //1.4 ตัวแปรที่ใช้เก็บเกรดค่าเฉลี่ยของนักศึกษา
        double studentGPA = 4.0;//ค่าเกรดเฉลี่ยของนักศึกษา

        //1.5 ตัวแปรที่ใช้เก็บค่าของ พาย (Pi- ค่าที่ใช้ในการหาเส้นทางรอบวงและพื้นที่วงกลม)
        final double PI = 3.14159; // ค่าของPi 8;igxHo8jk8'muj

        //1.6 ตัวแปรที่ใช้เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExpenses = 15000.00f; // ค่าใช้จ่ายรายปีของนักศึกษา

        //1.7 ตัวแปรที่ใช้เก็บค่าจำนวนของเดือนที่มีในหนึ่งปี
        final int MONTHS_IN_YEARS = 12 ; // จำนวนเดือนในหนึ่งปี ควรเป็นค่าคงที่

        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors : " + websiteVisitors);
        System.out.println("Studen Grade: " + studentGrade);
        System.out.println("Student GPA : " + studentGPA );
        System.out.println("Value of Pi : " + PI);
        System.out.println("Annual Expenses: "+ annualExpenses);
        System.out.println("MOnths in a Year : " + MONTHS_IN_YEARS);


    }
}