public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public String toString() {
        return "Der Radius beträgt " + radius;
    }
}
