public class TestLogic {
    public static void main(String[] args) {
        /*
        ตัวดำเนินการแบบสัมพัธ์
         *  > มากกว่า
         *  < น้อยกว่า
         *  == เท่ากับ
         *  >= มากกว่าหรือเท่ากับ
         *  <= น้อยกว่าหรือเท่ากับ
         *  != ไม่เท่ากับ
         * 6 > 7 false
         * 6 < 7 true
         * ตำดำเนินการหาตรรกศาสตร์
         * true/false
         * $$ AND และ  (6 > 7 && 8 = 10)
         * true && true = true
         * false && true = false
         * false && false = false
         * 
         * || OR  หรือ (8 > 7 || 10 > 10)
         * true || true = true
         * false || true = false
         * false || false = false
         *    NOT ไม่
         */
        int x = 6, y = 9;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != 6);
        System.out.println((x < y) && (y > 3));
        System.out.println((x == 5) || (y > 2));
        System.out.println(!(y > x));
    }
}
