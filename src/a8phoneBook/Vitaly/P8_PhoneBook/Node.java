package a8phoneBook.Vitaly.P8_PhoneBook;

public class Node {

    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;

    public Node next;


    public Node() {}

    public Node(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
