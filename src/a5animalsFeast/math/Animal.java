package a5animalsFeast.math;

public class Animal {
    String animalName;
    String dishName;

    public Animal(String animalName, String dishName) {
        this.animalName = animalName;
        this.dishName = dishName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", dishName='" + dishName + '\'' +
                '}';
    }
}