public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    public int calculatePerimeter() {
        return height * 2 + width * 2;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isSquare() {
        return (height != 0) && (width != 0) && (height == width);
    }
}