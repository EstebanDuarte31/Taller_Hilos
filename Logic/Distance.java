package Logic;

public class Distance {
    private double distance;
    private String id;

    public Distance(double distance, String id) {
        this.id = id;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return id;
    }
}
