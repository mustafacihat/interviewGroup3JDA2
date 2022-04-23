package solidPrinciples.singleResponsibility;

public class PrintInJson {

    CalculateArea calculate;

    public PrintInJson(CalculateArea calculate) {
        this.calculate = calculate;
    }

    public String printInJson() {

        return "\" the sum of all shapes is\" : " + calculate.sumAreaOfAllShapes();
    }
}
