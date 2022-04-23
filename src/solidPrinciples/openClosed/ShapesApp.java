package solidPrinciples.openClosed;

public class ShapesApp {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(3);
        Shape [] shapes = {circle, square};

        CalculateArea area = new CalculateArea(shapes);

        System.out.println(area.sumAreaOfAllShapes());

        PrintInJson print = new PrintInJson(area);
        System.out.println(print.printInJson());

    }
}
