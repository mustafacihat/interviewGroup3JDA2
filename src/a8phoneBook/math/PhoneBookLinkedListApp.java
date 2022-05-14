package a8phoneBook.math;

public class PhoneBookLinkedListApp {
    PhoneBook phoneBook;
    public static void main(String[] args) {
        PhoneBookSinglyLinkedList<PhoneBook> single = new PhoneBookSinglyLinkedList<>();
        PhoneBookDoublyLinkedList<PhoneBook> doubly= new PhoneBookDoublyLinkedList() ;
        doubly.insertAll(PhoneBookData.getAll().stream());
        doubly.printAll();
        doubly.printName();
        doubly.deleteAllMatchingLastName("Eder");
        doubly.printName();
        System.out.println(doubly.findAll());
        System.out.println(doubly.findByName("Carl").value.toString());
        doubly.deleteByName("Carl");
        doubly.printName();
        //Singly linkedlist
        single.insertAll(PhoneBookData.getAll().stream());
        single.printName();
        System.out.println("here is all");
        System.out.println(single.findAll());
        System.out.println(single.findAllByLastName("Eder"));
        single.deleteByName("Sigmund");
        single.deleteAllMatchingLastName("Eder");
        single.printAll();
        single.printNode(single.findByName("Carl"));
    }
}
