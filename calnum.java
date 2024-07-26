import java.util.Scanner; //เรียกใช้คลาส Scanner
class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in); //stpe 2 สร้างออนเจ็กต์ in สำหรับรับข้อมูล
        System.out.print("Input Number1 : ");
        x = in.nextInt(); // stpe 3 รับตัวเลขเป็นจำนวนเต็ม
        System.err.println("Your Number is "+x);
        System.out.print("Input Number2 : ");
        y = in.nextInt();
        System.err.println("Your Number is "+y);
        System.err.println(x+ " + " +y+ " = " +(x+y ));
    }
}
