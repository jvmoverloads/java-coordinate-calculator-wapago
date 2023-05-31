package coordinate;

import coordinate.calculatorview.InputView;
//import coordinate.factory.CalculationFactory;
import coordinate.factory.CalculationFactory;
import coordinate.factory.PolygonFactory;
import coordinate.shape.Polygon;

public class CoordinateCalculator {
    private Points points;

    public void start() {
        init();
        Polygon polygon = PolygonFactory.getPolygonType(this.points);
        double result = CalculationFactory.calculate(polygon);

        System.out.println("result = " + result);
    }

    public void init() {
        InputView.askPoints();
        initPoints(InputView.getPoints());
    }

    public void initPoints(String points) {
        this.points = new Points(points);
    }
}
