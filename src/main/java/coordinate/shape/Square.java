package coordinate.shape;

import coordinate.Points;

import java.util.HashSet;
import java.util.Set;

public class Square extends Polygon {

    private static final String POLYGON_NAME = "SQUARE";
    private static final int POINT_NUMBER = 4;
    protected final Points points;

    public Square(Points points) {
        super(points, POINT_NUMBER, POLYGON_NAME);
        this.points = points;
    }

    @Override
    public double calculateArea() {
        Set<Integer> xPoints = new HashSet<Integer>();
        Set<Integer> yPoints = new HashSet<Integer>();

        int result = 0;

        for (int i = 0; i < POINT_NUMBER; i++) {
            xPoints.add(this.points.getPoints().get(i).getX());
            yPoints.add(this.points.getPoints().get(i).getY());
        }

        if (xPoints.size() == 2 && yPoints.size() == 2) {
            Integer[] vertical = new Integer[2];
            Integer[] horizonal = new Integer[2];

            vertical[0] = (Integer)xPoints.stream().sorted().toArray()[0];
            vertical[1] = (Integer)xPoints.stream().sorted().toArray()[1];

            horizonal[0] = (Integer)yPoints.stream().sorted().toArray()[0];
            horizonal[1] = (Integer)yPoints.stream().sorted().toArray()[1];

            result = (horizonal[1] - horizonal[0]) * (vertical[1] - vertical[0]);
        }

        return (double) result;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("사각형은 최소 4개의 점이 필요합니다.");
    }
}
