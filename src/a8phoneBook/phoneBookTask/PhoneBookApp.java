package a8phoneBook.phoneBookTask;

import java.util.List;

public class PhoneBookApp {

    public static void main(String[] args) throws Exception {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.add("Michael", "Jordan", "mic@cydeo.com",
                "+1123654789");
        System.out.println("Check add method --->>> ");
        myPhoneBook.printPhoneBook();

        System.out.println();

        myPhoneBook.add("Larry", "Bird", "larry@cydeo.com",
                "+7123654789");
        myPhoneBook.add("Jim", "Bird", "jim@cydeo.com",
                "+6123654789");
        myPhoneBook.add("Michael", "Jordan", "micc@cydeo.com",
                "+1123654789");
        myPhoneBook.add("Michael", "Jordan", "miccc@cydeo.com",
                "+1123654789");

        System.out.println("Check isEmpty method --->>> " + myPhoneBook.isEmpty());
        System.out.print("Check printPhoneBook method --->>> ");
        myPhoneBook.printPhoneBook();

        System.out.println();

        List<PNode> all = myPhoneBook.findAll();
        System.out.println("Check findAll method --->>> " + all);

        System.out.println("Check findByName method(will return the first occurrence) --->>> " + myPhoneBook.findByName("Michael"));
        System.out.println("Check findAllByLastName method --->>> " + myPhoneBook.findAllByLastName("Bird"));

        myPhoneBook.deleteByName("Michael");
        System.out.print("Check deleteByName method(will delete the first occurrence) --->>> ");
        myPhoneBook.printPhoneBook();

        System.out.println();

        myPhoneBook.deleteAllMatchingLastName("Jordan");
        System.out.print("Check deleteAllMatchingLastName method --->>> ");
        myPhoneBook.printPhoneBook();

        System.out.println();

        System.out.println("Check findByUniqueValueEfficient method --->>> " + myPhoneBook.findByUniqueValueEfficient("larry@cydeo.com"));

    }
}
