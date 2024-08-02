import java.util.Scanner;

public class Ex5_1 {
    
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("กรุณาใส่ความยาวฐานของสามเหลี่ยม: ");
        double base = scanner.nextDouble();
        
        System.out.print("กรุณาใส่ความสูงของสามเหลี่ยม: ");
        double height = scanner.nextDouble();
        
        double area = calculateTriangleArea(base, height);
        
        System.out.printf("พื้นที่ของสามเหลี่ยมคือ: %.2f\n", area);
        
        scanner.close();
    }
}
