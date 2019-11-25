import java.util.ArrayList;

public class ReverseListDemo {

    public static <E> ArrayList<E> reverseList(ArrayList <E> list){
        ArrayList<E> newList = new ArrayList<E>();

        for(int i = list.size() -1; i>-1; i--) {
            newList.add(list.get(i));

        }
        return newList;
    }
}
