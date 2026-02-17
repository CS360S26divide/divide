public class Triangle extends Shape {
    private int base;
    private int height;
    private String color = "blue";

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
