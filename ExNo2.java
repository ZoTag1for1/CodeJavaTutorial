public class ExNo2 {
    public static void main(String[] args) {
        System.out.println("เลขที่ไม่เกิน 100 หารด้วย 3 และ 5 ลงตัว ได้แก่ : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
