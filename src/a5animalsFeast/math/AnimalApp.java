package a5animalsFeast.math;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnimalApp {
    public static void main(String[] args) {


        //Solution with behaviour Parameterization (Strategy Design Pattern)
        List<Animal> matchSensitiveEater = filterAnimal(AnimalData.getAll(),new AnimalCaseSensitiveImpl());
        System.out.println(matchSensitiveEater);

        List<Animal> matchIgnoreCaseEater = filterAnimal(AnimalData.getAll(),new AnimalIgnoreCaseImpl());
        System.out.println(matchSensitiveEater);

        //Solution with Predicate Functional Interface

        Predicate<Animal> matchedEater =  a-> a.dishName.startsWith(a.animalName.substring(0,1)) && a.dishName.endsWith(a.animalName.substring(a.animalName.length()-1,a.animalName.length()));


            //find  matched dish eater animal with Stream
        AnimalData.getAll().stream()
                .filter(p -> p.animalName.charAt(0) == p.dishName.charAt(0) &&
                        p.animalName.charAt(p.animalName.length() - 1) == p.dishName.charAt(p.dishName.length() - 1))
                .forEach(System.out::println);
    }

    private static List<Animal> filterAnimal(List<Animal> all, AnimalPredicate animalPredicate) {
        List<Animal> result = new ArrayList<>();
        for(Animal animal: all){
            if(animalPredicate.test(animal))
                result.add(animal);
        }
        return result;
    }
}

