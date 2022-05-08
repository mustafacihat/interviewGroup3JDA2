package a5animalsFeast.Andrei;

import java.util.Locale;

public class AnimalFeast {

    public static void main(String[] args) {
        System.out.println(animalAccess("  -Chaffs- HBO-", "-Cgj ho-  "));
    }


    public static boolean animalAccess(String animal, String dish) {
        animal = animal.trim().toLowerCase(Locale.ROOT);
        dish = dish.trim().toLowerCase(Locale.ROOT);
        animal = (animal.startsWith("-")) ? animal.replaceFirst("-", "") : animal;
        dish = (dish.startsWith("-")) ? dish.replaceFirst("-", "") : dish;
        animal = (animal.endsWith("-")) ? animal.substring(0, animal.length() - 1) : animal;
        dish = (dish.endsWith("-")) ? dish.substring(0, dish.length() - 1) : dish;
        if (animal.matches(".*\\d.*") || dish.matches(".*\\d.*")) return false;
        if (animal.length() < 2 || dish.length() < 2) return false;
        else
            return animal.charAt(0) == dish.charAt(0) && animal.charAt(animal.length() - 1) == dish.charAt(dish.length() - 1);
    }


}
