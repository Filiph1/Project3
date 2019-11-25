import geometric.Circle;
import geometric.Rectangle;
import geometric.Shape;
import java.math.BigInteger;

public class ComparableTupleDemo
{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(2, 8);
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(4);


        Tuple<Shape> t1 = new Tuple<>(r1, c1);
        Tuple<Shape>  t2 = new Tuple<>(c2, r2);
        Tuple<Rectangle> tR = new Tuple<>(r1, r2);
        Tuple<Circle> tC = new Tuple<>(c1, c2);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(tR.toString());
        System.out.println(tC.toString());

        System.out.println(Tuple.compare(t1, t2));
        System.out.println(Tuple.compare(tR, tC));
        System.out.println(Tuple.compare(t1, tR));
        System.out.println(Tuple.compare(tC, t2));
        System.out.println(Tuple.compare(t2, t1));

        Tuple<BigInteger> big1 = new Tuple<>(BigInteger.ONE, BigInteger.TEN);
        Tuple<BigInteger> big2 = new Tuple<>(new BigInteger("2"), new BigInteger("15"));

        System.out.println(Tuple.compare(big1, big2));



        // The following two lines should NOT compile if the method
        // was created correctly:
        // System.out.println(Tuple.compare(t1, big1);
        // System.out.println(Tuple.compare(big2, tR));

    }
}
