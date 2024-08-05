import java.util.Scanner;
public class PatArray {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRatage;
        double grossPay;
        int [] hour = new int [EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours worked by " +EMPLOYEES+ "Employees who all earn ");
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.println("Employees #" +(index + 1)+ " : ");
            hour[index] = in.nextInt();
        }
        System.out.println("Enter the hours pay rate for each employess : ");
        payRatage = in.nextDouble();
        for(int index = 0; index < EMPLOYEES; index++){
            grossPay = hour[index] + payRatage;
            System.out.println("Employess #" +(index + 1) +" : $"+grossPay);
        }
        }
    }

