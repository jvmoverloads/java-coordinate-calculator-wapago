package coordinate.shape;

import coordinate.Points;

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
        return 0;
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("사각형은 최소 4개의 점이 필요합니다.");
    }
}
