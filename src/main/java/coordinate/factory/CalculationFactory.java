package coordinate.factory;

import coordinate.shape.Polygon;

public class CalculationFactory {

    public static double calculate(Polygon polygon) {
        String name = polygon.getPolygonName();
        System.out.println("name >>> " + name);

        if (name.equals("STRAIGHT")) {
            System.out.println("name = " + name);
            return polygon.calculateDistance();
        }

        if (name.equals("TRIANGLE")) {
            System.out.println("name = " + name);
            return polygon.calculateArea();
        }

        if (name.equals("SQUARE")) {
            System.out.println("name = " + name);
            return polygon.calculateArea();
        }

        return 0;
    }
}
