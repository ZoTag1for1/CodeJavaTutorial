public class Student {
    public String name;
    public String email;

    public Student(){
        name = "Unassigned";
        email = "Unassigned";
    }
    public void setName(String Studentname){
        name = Studentname;
    }
    public void setEmail(String address){
        email = address;
    }
    public String getname(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
