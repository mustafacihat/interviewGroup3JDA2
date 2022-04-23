package solidPrinciples.singleResponsibility;

public class ShapesApp {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(3);
        Object [] shapes = {circle, square};

        CalculateArea area = new CalculateArea(shapes);

        System.out.println(area.sumAreaOfAllShapes());
        System.out.println(area.printInJson());


        PrintInJson print = new PrintInJson(area);
        System.out.println(area.sumAreaOfAllShapes());
        System.out.println(print.printInJson());

    }
}
