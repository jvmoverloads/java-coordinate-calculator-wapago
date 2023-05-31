package coordinate.shape;

import coordinate.Point;
import coordinate.Points;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Polygon {

    private static final String POLYGON_NAME = "TRIANGLE";
    private static final int POINT_NUMBER = 3;
    protected final Points points;

    public Triangle(Points points) {
        super(points, POINT_NUMBER, POLYGON_NAME);
        this.points = points;
    }

    @Override
    public double calculateArea() {
        List<Double> distances = getDistances();

        double a = distances.get(0);
        double b = distances.get(1);
        double c = distances.get(2);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private List<Double> getDistances() {
        List<Point> vertexes = points.getPoints();
        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);
        Point point3 = vertexes.get(2);

        double distance1 = Straight.calculateDistance(point1, point2);
        double distance2 = Straight.calculateDistance(point2, point3);
        double distance3 = Straight.calculateDistance(point1, point3);

        return Arrays.asList(distance1, distance2, distance3);
    }


    @Override
    void errorMessage() {
        throw new IllegalArgumentException("삼각형은 최소 3개의 점이 필요합니다.");
    }
}
