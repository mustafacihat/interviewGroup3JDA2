package a5animalsFeast.math;

import java.util.Arrays;
import java.util.List;

public class AnimalData {
    public static List<Animal> getAll(){
        return Arrays.asList(
                new Animal("Elephant","Elephant Soupe"),
                new Animal("Cow","Black Peas"),
                new Animal("Monkeys","monkey roasts"),
                new Animal("penguins","pickled chicken"),
                new Animal("pigs","pinky grass"),
                new Animal("wolwes","wolves")

        );
    }

}
