package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FastRemoveDS {
    private ArrayList<Integer> arr;
    private HashMap<Integer, Integer> indices;

    public FastRemoveDS() {
        arr = new ArrayList<>();
        indices = new HashMap<>();
    }

    public int size() {
        return arr.size();
    }
    public void add(int x) {
        // Already exists this element in array
        if (indices.get(x) != null) {
            return;
        }
        indices.put(x, arr.size());
        arr.add(x);
    }

    public void remove(int x) {
        // Does not exist this element
        Integer index = indices.get(x);
        if (index == null) {
            return;
        }
        indices.remove(x);
        Collections.swap(arr, index, arr.size() - 1);
        arr.remove(arr.size() - 1);
        indices.put(arr.get(index), index);
    }

    @Override
    public String toString() {
        return "FastRemoveDS{" +
                "arr=" + arr +
                ", indices=" + indices +
                '}';
    }
}
