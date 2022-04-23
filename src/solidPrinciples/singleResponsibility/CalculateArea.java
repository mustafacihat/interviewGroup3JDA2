package solidPrinciples.singleResponsibility;

public class CalculateArea {

    Object[] shapes;

    public CalculateArea(Object[] shapes) {
        this.shapes = shapes;
    }

    public double sumAreaOfAllShapes() {
        double sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                sum += Math.pow(((Circle) shape).radius, 2) * Math.PI;
            }

            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).side, 2);
            }
        }

        return sum;
    }

    public String printInJson() {

        return "\" the sum of all shapes is\" : " + sumAreaOfAllShapes();
    }

}
