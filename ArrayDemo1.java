import java.util.*;
public class ArrayDemo1 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3 ; //ตัวแปรคงที่
        int[] hour = new int[EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hour's workec by " + EMPLOYEES+ "employees : " );
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.println("Employees " +(index + 1)+ " : ");
            hour[index] = in.nextInt();
        }
        System.out.println("The Hours ypu Employees are : ");
        for(int index =0; index < EMPLOYEES; index++){
            System.out.println(hour[index]);
        }
    }
}
