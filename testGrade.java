import java.util.Scanner;
public class testGrade {
    public static void main(String[] args) {
        int score;
        Scanner int = new Scanner(System.in);
        System.out.print("Enter your score : ");
        score = in.nextInt();
        if (score < 50) {
            //Statement1
            System.out.println("Your grade is f .");
        }else if(score < 60){
            System.out.println("Your grade is D ");
        }else if(score < 70){
            System.out.println("Your grade is C ");
        }else if(score < 80){
            System.out.println("Your grade is B ");
        }else if(score <= 100){
            //Statement2
            System.out.println("Your grade is A ");
        }else{
            //false
            System.out.println("Invalid score. ");
        }
    }
}
