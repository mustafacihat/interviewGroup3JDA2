package a5animalsFeast.math;

public class AnimalTest {
    public static void main(String[] args) {
        String animalName = "elephants";
        String dishName = "elephant foods";
        System.out.println(nameMatchedEater(animalName,dishName));
    }

    private static boolean nameMatchedEater(String animalName, String dishName) {

        return animalName.charAt(0) == dishName.charAt(0) && animalName.charAt(animalName.length()-1)== dishName.charAt(dishName.length()-1);
    }
}
