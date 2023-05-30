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

        for (Double distance : distances) {
            System.out.println("distance = " + distance);
        }

        // 헤론의 공식
        // s = a + b + c / 2
        // S(면적) = s(s-a)(s-b)(s-c)의 제곱근
        double a = distances.get(0);
        double b = distances.get(1);
        double c = distances.get(2);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private List<Double> getDistances() {
        // 꼭지점
        List<Point> vertexes = points.getPoints();
        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);
        Point point3 = vertexes.get(2);

        // 각 꼭지점 간 거리 (빗변)
        double distance1 = point1.getDistance(point2);
        double distance2 = point1.getDistance(point3);
        double distance3 = point2.getDistance(point3);

        return Arrays.asList(distance1, distance2, distance3);
    }

    @Override
    public double calculateDistance() {
        return 0;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("삼각형은 최소 3개의 점이 필요합니다.");
    }
}
