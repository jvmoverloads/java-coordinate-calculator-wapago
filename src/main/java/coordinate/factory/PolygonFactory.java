package coordinate.factory;

import coordinate.Points;
import coordinate.shape.Polygon;
import coordinate.shape.Square;
import coordinate.shape.Straight;
import coordinate.shape.Triangle;

public class PolygonFactory {

    public static Polygon getPolygonType(Points points) {
        int length = points.getLength();

        if (length == 2) {
            Polygon straight = new Straight(points);

            return straight;
        }

        if (length == 3) {
            Triangle triangle = new Triangle(points);

            return triangle;
        }

        if (length == 4) {
            Square square = new Square(points);

            return square;
        }

        throw new IllegalArgumentException();
    }
}
