package lesson13.DZ;

import java.util.*;

public class SetUtils implements ISetUtils{
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet <String> result = new TreeSet<>();
        for (Integer c: collection1) {
           result.add(c.toString());
        }
        for (String s: set2) {
            result.add(s);
        }
        return result.subSet(result.last(),result.first());
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet <Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);
        return  result;
    }
}
