package a8phoneBook.Vitaly.P8_PhoneBook;

public class app {

    public static void main(String[] args) {
        LinkedList_PhoneBook phoneBook = new LinkedList_PhoneBook();
        phoneBook.insert(new Node("jon", "smith", "jsmith@gmail.com", "123465798"));
        phoneBook.insert(new Node("bob", "davis", "bdavis@gmail.com", "22233344466"));
        phoneBook.insert(new Node("rick", "brown", "rbrown@gmail.com", "987654321"));
        phoneBook.insert(new Node("bob", "gold", "bgold@gmail.com", "33333333333"));

        System.out.println(phoneBook.searchByName("bob").phoneNumber);

        phoneBook.findAllByName("bob").stream().forEach(p-> System.out.println(p.phoneNumber));

        phoneBook.printBook();
        System.out.println(">>>>>>>>>>>");
        phoneBook.deleteByName("bob");
        phoneBook.printBook();
        System.out.println(">>>>>>>>>>>");
        phoneBook.deleteByName("rick");
        phoneBook.printBook();
        System.out.println(">>>>>>>>>>>");

        System.out.println(phoneBook.findAll());
        System.out.println(">>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>");
        phoneBook.insert(new Node("jon", "smith", "jsmith@gmail.com", "123465798"));
        phoneBook.insert(new Node("bob", "davis", "bdavis@gmail.com", "22233344466"));
        phoneBook.insert(new Node("rick", "smith", "rbrown@gmail.com", "987654321"));
        phoneBook.insert(new Node("bob", "gold", "bgold@gmail.com", "33333333333"));
        phoneBook.printBook();
        System.out.println(">>>>>delete smiths>>>>>>");
        phoneBook.deleteByLastName("smith");
        phoneBook.printBook();

    }



}
