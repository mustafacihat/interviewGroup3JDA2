package a8phoneBook.Andrei;

public class App {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Andrei", "Selv",65656565L,"sel@gmail.com");
        Contact contact2 = new Contact("John", "Tom",65656565L,"sel@gmail.com");
        Contact contact3 = new Contact("Sergei", "DAr",65656565L,"sel@gmail.com");
        Contact contact4 = new Contact("John", "Tom",65656565L,"sel@gmail.com");
        Contact contact5 = new Contact("Vlad", "Fre",65656565L,"sel@gmail.com");
        Contact contact6 = new Contact("John", "Tom",65656565L,"sel@gmail.com");


        PhoneBook book = new PhoneBook();
        book.add(contact1);
        book.add(contact2);
        book.add(contact3);
        book.add(contact4);
        book.add(contact5);
        book.add(contact6);


        book.findAll().stream().map(p-> p.contact.getFirstName()).forEach(System.out::println);
        book.print();

    }
}
