package a8phoneBook.math;

import java.util.Arrays;
import java.util.List;

public class PhoneBookData {

    public static List<PhoneBook> getAll() {
        return Arrays.asList(
                new PhoneBook("David", "Eder", "efrom@psiko.com", 123456789),
                new PhoneBook("Sigmund", "Freud", "sigmund@psiko.com", 123456788),
                new PhoneBook("Albert", "Eder", "albert@psiko.com", 123456787),
                new PhoneBook("Robert", "Eder", "robert@psiko.com", 123456769),
                new PhoneBook("Carl", "Rogers", "carl@psiko.com", 123456785),
                new PhoneBook("William", "James", "william@psiko.com", 123436789),
                new PhoneBook("Ivan", "Pavlov", "ivan@psiko.com", 123456784),
                new PhoneBook("Erik", "Erikson", "erik@psiko.com", 123456783),
                new PhoneBook("Carl", "Jung", "carl@psiko.com", 123456782)


        );
    }
}