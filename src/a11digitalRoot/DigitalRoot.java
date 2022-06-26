package a11digitalRoot;

public class DigitalRoot {
    public static void main(String[] args) {
        int number = 925;
        System.out.println(digitalRoot(number));

    }



    private static int digitalRoot(int number) {
        if (number<10) return number;
        Integer sum = String.valueOf(number).chars().map(Character::getNumericValue) // 3n
                .boxed().reduce(0,(a,b)->a+b); //4n

        return digitalRoot(sum); //nlogn
    }
}
