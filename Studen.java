public class Studen {
    public String id;
    public String name;
    public double gpa;
    public void setDetalls(String ID, String n, double GPA){
        id = ID;
        name = n;
        gpa= GPA;
    }
    public void showDetalls(){
        System.out.println("ID : " +id);
        System.out.println("Name : " +name);
        System.out.println("GPA : " +gpa);
    }
    public static void main(String[] args) {
        Studen sc1 = new Studen();
        sc1.setDetalls("12123", "PHONGSATHON", 4.00);
        sc1.showDetalls();
        Studen sc2 = new Studen();
        sc2.setDetalls("12121", "PP", 4.00);
        sc2.showDetalls();
    }
}

