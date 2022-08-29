package lesson20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MultiMapImpl<K, V> extends HashMap<K, V> implements MultiMap<K,V> {
private HashMap<K, List<V>> multiMap = new HashMap<>(); // List - список номеров (не один)
    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)){
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key,values);
            //добавили номер в существующий контакт
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key,values);
            //создали новый контакт
        }

        return value;
    }

}
