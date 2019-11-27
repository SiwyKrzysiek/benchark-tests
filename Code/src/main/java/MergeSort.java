import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public List<Integer> sort(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        divide(array, 0, list.size() - 1);
        return new ArrayList<>(Arrays.asList(array));
    }

    private void divide(Integer[] array, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;

            divide(array, l, m);
            divide(array, m + 1, r);

            merge(array, l, m, r);
        }
    }

    private void merge(Integer[] array, int l, int m, int r) {

    }
}
