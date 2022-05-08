package a5animalsFeast.Jose;

public class AnimalFeast {

//    Algorithm Question:
//    All of the animals are having a feast! Each animal is bringing one dish.

//    There is just one rule: the dish must start and end with the same letters as the animal's name.
//    For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

//    Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
//    whether the beast is allowed to bring the dish to the feast.
//    Assume that beast and dish are always lowercase strings, and that each has at least two letters.
//    beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
//    They will not contain numerals.


    public static void main(String[] args) {

        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("great blue heron","garlic naan"));
        System.out.println(feast("donkey","dy "));


    }


    public static boolean feast(String animal,String dish){

        return dish.startsWith(animal.substring(0,1)) && dish.endsWith(animal.substring(animal.length()-1,animal.length()));

    }

}
