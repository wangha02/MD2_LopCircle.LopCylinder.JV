public class Cylinder extends Circle {
    private double volume = 1.0;
    private double height = 1.0;

    public Cylinder(double v, double v1, int i, String blue){

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double volume, double height) {
        this.volume = volume;
        this.height = height;
    }

    public Cylinder(int radius, String color, double volume, double height) {
        super(radius, color);
        this.volume = volume;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume +
                ", height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
