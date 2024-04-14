public class Rectangle extends Shape {
    protected double height;
    protected double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public String toString() {
        return "Die Höhe beträgt " + height + " und die Breite beträgt " + width;
    }
}
