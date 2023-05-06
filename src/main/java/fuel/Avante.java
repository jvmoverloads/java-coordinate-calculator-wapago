package fuel;

public class Avante extends Car{
    private final int DISTANCE_PER_LITER = 15;

    public Avante(int distanceToTravel) {
        super(distanceToTravel);
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return super.distanceToTravel;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
