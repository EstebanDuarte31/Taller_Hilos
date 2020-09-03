package Logic;

public class Destination {

    private String target;
    private double distance;
    private double value;


    public Destination(String target, double distance, double value) {
        this.target = target;
        this.distance = distance;
        this.value = value;
    }


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "nombre='" + target + '\'' +
                ", distance=" + distance +
                ", value=" + value +
                '}';
    }


}
