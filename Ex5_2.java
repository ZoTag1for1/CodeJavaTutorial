public class Ex5_2 {
    public static void main(String[] args) {
        System.out.println("ค่าของ x ยกกำลัง 3 สำหรับ x ตั้งแต่ 1 ถึง 10:");

        for (int x = 1; x <= 10; x++) {
            int result = x * x * x; 
            System.out.printf("%d^3 = %d\n", x, result);
        }
    }
}
