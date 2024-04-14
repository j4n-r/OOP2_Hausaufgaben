public class Cylinder extends Circle implements ThreeDShape {
    private double depth;

    public Cylinder(double radius, double depth) {
        super(radius);
        this.depth = depth;
    }

    public double getVolume() {
        return super.getArea() * depth;
    }

}
