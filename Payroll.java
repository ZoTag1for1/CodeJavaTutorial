import java.util.Scanner;
class Payroll {
    public static void main(String[] args) {
        /*
         * 1. nextByte()    ชนิดข้อมูลแบบ Byte
         * 2. nextDouble()  ชนิดข้อมูลแบบ Double
         * 3. nextFloat()   ชนิดข้อมูลแบบ Float
         * 4. nextInt()     ชนิดข้อมูลแบบ Int
         * 5. nextLine()    ชนิดข้อมูลแบบ Line
         * 6. nextLong()    ชนิดข้อมูลแบบ Long
         * 7. nextShory()   ชนิดข้อมูลแบบ Shory
         */
        String name;
        int hours;
        double Payrate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is Your Namer? : ");
        name = keyboard.nextLine();
        System.out.print("How many houre did you work this week? : ");
        hours = keyboard.nextInt();
        System.out.print("What  is your hourly pay rate? : ");
        Payrate = keyboard.nextDouble();
        grossPay = hours * Payrate;
        System.out.println("Hello "+name);
        System.out.println("Yout gross pay is "+grossPay);
    }
}
