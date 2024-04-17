import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0, 5.0);
        System.out.println(rectangle.getArea());

        Shape circle = new Circle(4.0);
        System.out.println(circle.getArea());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);

        for (Shape s : shapes) {
            System.out.println(s);
        }

        List<ThreeDShape> threeDShapes = new ArrayList<>();
        ThreeDShape cylinder = new Cylinder(5, 3);
        ThreeDShape box = new BoxShape(2, 3, 4);

        threeDShapes.add(cylinder);
        threeDShapes.add(box);
        for (ThreeDShape s : threeDShapes) {
            System.out.println(s.getVolume());
        }

    }
}
