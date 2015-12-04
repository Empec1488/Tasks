/**
 * Created by Admin on 29.11.2015.
 */
public class MainClass {

    public static void main(String[] args) {
        Shape shape = new Traingle();
        Traingle traingle = new Traingle();
        shape.draw();
        traingle.draw();
        shape = new Circle(5);
        Circle circle = ((Circle)shape);
        int diameter = circle.calculateDiameter();
        System.out.println("diameter = " + diameter);
        Rectangle rectangle = new Rectangle(1, 1);
        System.out.println("perimeter = " + rectangle.calculatePerimeter());
        System.out.println("isSquare? " + rectangle.isSquare());
        System.out.println("height = " + rectangle.getHeight());
    }

}
