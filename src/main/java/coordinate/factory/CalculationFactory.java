package coordinate.factory;

import coordinate.Point;
import coordinate.Points;
import coordinate.shape.Polygon;
import coordinate.shape.Straight;

public class CalculationFactory {

    public static double calculate(Polygon polygon) {
        String name = polygon.getPolygonName();

        if (name.equals("STRAIGHT")) {
            Points points = polygon.getPoints();

            Point point1 = points.getPoints().get(0);
            Point point2 = points.getPoints().get(1);

            return Straight.calculateDistance(point1, point2);
        }

        if (name.equals("TRIANGLE")) {
            return polygon.calculateArea();
        }

        if (name.equals("SQUARE")) {
            return polygon.calculateArea();
        }

        return 0;
    }
}
