import java.util.*;
public class Cal_Max {
        public static void main(String[] args) {
            int num1, num2;
            Scanner Stdin = new Scanner(System.in);
            System.out.println("Input number 1 : ");
            num1 = Stdin.nextInt();
            System.out.println("Input number 2 : ");
            num2 = Stdin.nextInt();
            int larger = TestMax.max(num1, num2);
            System.out.println("Max Data is " +larger);
    }
}
