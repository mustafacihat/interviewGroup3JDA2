package a5animalsFeast.math;

public class AnimalIgnoreCaseImpl implements AnimalPredicate{
    @Override
    public boolean test(Animal animal) {
        String animalChars = animal.animalName.charAt(0)+ "" + animal.animalName.charAt(animal.animalName.length()-1);
        String dishChars = animal.dishName.charAt(0)+ "" + animal.dishName.charAt(animal.dishName.length()-1);

        return animalChars.equalsIgnoreCase(dishChars);

    }
}
