package coordinate.shape;

import coordinate.Points;
import coordinate.domain.Calculatable;

public abstract class Polygon implements Calculatable {
    protected final Points points;
    protected final String polygonName;

    public Polygon(Points points, int pointNumber, String polygonName) {
        if (points.getLength() != pointNumber)
            errorMessage();

        this.points = points;
        this.polygonName = polygonName;

    }

    abstract void errorMessage();

    public Points getPoints() {
        return points;
    }

    @Override
    public double calculateArea() {
        if (points.getLength() >= 3){
            return calculateArea();
        }

        return 0;
    }

    @Override
    public String getPolygonName() {
        return this.polygonName;
    }
}
