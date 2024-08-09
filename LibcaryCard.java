public class LibcaryCard {
    private Student owenr;
    private int borrowcnt;
    private LibcaryCard(){
        owenr = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBook){
        borrowcnt = borrowcnt * numOfBook;
    }
    public void SetOwenrName(Student student){

        owenr = student;
    }
    public int = getNuberOfBook(){
        return borrowcnt;
    }
    public int = getOwneName(){
        return owenr.getname();
    }
    public String toString(){
        return "Owner Name : " +owenr.getname() +"\n"+"Email : " +owenr.getEmail() +"\n"+"Books Borrowed" +borrowcnt;
    }
}
