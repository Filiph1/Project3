package geometric;

public abstract class Shape implements Comparable<Shape>
{
    public abstract double getArea();

    public abstract String toString();

    @Override
    public int compareTo(Shape that) {
        int compare = 0;
        if (this.getArea() > that.getArea())
            compare = 1;
        else if (this.getArea() < that.getArea())
            compare = -1;
        return compare;
    }
}
