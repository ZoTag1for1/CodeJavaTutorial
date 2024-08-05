import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList namList = new ArrayList<>();
        namList.add("Ball");
        namList.add("JAVA");
        namList.add("Micro");
        System.out.println("The ArrayList Has " +namList.size()+" Objects stored in it. ");
        for(int index = 0; index < namList.size(); index++){
            System.out.println(namList.get[index]);
        }
    }
}
