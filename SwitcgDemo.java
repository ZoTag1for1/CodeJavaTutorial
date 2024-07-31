import java.util.Scanner;
public class SwitcgDemo {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1, 2, or 3 : ");
        number = keyboard.nextInt();
        switch (number) {
            case 1: //number = 1
                System.out.println("You Enter 1.");
            break;
            case 2: //number = 2
                System.out.println("You Enter 2.");
            break;
            case 3: //number = 3
                System.out.println("You Enter 3.");
            break;
            default:
            System.out.println("that's not 1, 2, or 3 : ");
        }
    }
}
