import java.util.Scanner;

public class Ex5_3 {
    
    public static int findMax(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่เลขจำนวนที่ 1: ");
        int number1 = scanner.nextInt();
        
        System.out.print("กรุณาใส่เลขจำนวนที่ 2: ");
        int number2 = scanner.nextInt();
        
        int max = findMax(number1, number2);
        
        System.out.printf("ค่าสูงสุดระหว่าง %d และ %d คือ: %d\n", number1, number2, max);
        
        scanner.close();
    }
}
