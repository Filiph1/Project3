public class Tuple<T> {

    private T first;
    private T second;

    public Tuple(T first, T second)
    {
        this.first = first;
        this.second = second;
    }
    public T getFirst()
    {
        return this.first;
    }

    public T getSecond()
    {
        return this.second;
    }
    public String toString()
    {
        return "(" + first.toString() +", " + second.toString() + ")";
    }

    public static <T extends Comparable< ? super T>> int compare(Tuple<? extends T> one, Tuple<? extends T> two)
    {
        if((one.getFirst().compareTo(two.getFirst()) > 0) && one.getSecond().compareTo(two.getSecond()) > 0 )
            return 1;
        else if((one.getFirst().compareTo(two.getFirst()) < 0 ) && one.getSecond().compareTo(two.getSecond()) < 0 )
            return -1;
        else
            return 0;

    }
}
