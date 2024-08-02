import java.util.Scanner;

public class Ex5_4 {
    
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "เลขคู่";
        } else {
            return "เลขคี่";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("กรุณาใส่ตัวเลข: ");
        int number = scanner.nextInt();
        
        String result = checkEvenOrOdd(number);
        
        System.out.printf("%d เป็น %s\n", number, result);
        
        scanner.close();
    }
}
