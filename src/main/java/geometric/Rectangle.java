package geometric;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle " + getArea();
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
