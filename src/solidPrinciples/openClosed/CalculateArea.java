package solidPrinciples.openClosed;

public class CalculateArea {

    Shape[] shapes;

    public CalculateArea(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double sumAreaOfAllShapes() {
        double sum = 0;
        for (Shape shape : shapes) {
         sum +=shape.getArea();
        }

        return sum;
    }

}
