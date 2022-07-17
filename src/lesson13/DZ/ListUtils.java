package lesson13.DZ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtils implements IListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> s = new ArrayList<>();
        s.add(String.valueOf(strings));
        return s;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        LinkedList<Double> list = new LinkedList<>(sortedList(data).subList(data.size(),0));
        return  list;

    }
}
