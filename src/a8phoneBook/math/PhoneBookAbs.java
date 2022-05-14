package a8phoneBook.math;

import java.util.List;
import java.util.stream.Stream;

public interface PhoneBookAbs<T> {

    void insert(T t);
    void insertAll(Stream<T> stream);
    List<T> findAll();
    List<T> findAllByLastName(String lastName);
    void deleteByName(String Name);
    void deleteAllMatchingLastName(String lastName);
    void printAll();
    void printName();
    void printNode(Node<T> node);
}