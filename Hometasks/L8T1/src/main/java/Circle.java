public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    public int calculateDiameter() {
        return radius * 2;
    }

}
