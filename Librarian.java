public class Librarian {
    public static void main(String[] args) {
        Studen st1;
        LibraryCard card1, card2;
        st1 = new Studen();
        st1.setName("Jon Java");
        st1.setEmail("jj@gmail.com");
        card1 = new LibcaryCard();
        card1 = setOwnrName(st1);
        card1 = checkOut(3);
        card2 = new LibraryCard();
        card2 = SetOwenrName(st1);
        System.out.println("Card1 Info : ");
        System.out.println(card1.toString()+"\n");
        System.out.println("Card1 Info : ");
        System.out.println(card1.toString()+"\n");
    }
}
