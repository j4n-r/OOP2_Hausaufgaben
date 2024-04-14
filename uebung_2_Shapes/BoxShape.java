public class BoxShape extends Rectangle implements ThreeDShape {
    private double depth;

    public BoxShape(double height, double width, double depth) {
        super(height, width);
        this.depth = depth;
    }

    public double getVolume() {
        return super.getArea() * depth;
    }
}
