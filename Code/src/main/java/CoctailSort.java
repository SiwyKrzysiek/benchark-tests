
import java.util.Arrays;
import java.util.List;

public class CoctailSort<T extends Comparable> implements SortingAlgorithm<T> {
    Comparable temp;

    @Override
    public List<T> sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        Boolean is_swapped = true;
        int begin=0;
        int end = array.length -1;
        while (is_swapped) {
            is_swapped = false;
            for (int i = begin; i < end; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    is_swapped = true;
                }
            }
            if (!is_swapped) break;
            is_swapped = false;
            for (int i = end - 1; i >= begin; i--) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    is_swapped = true;
                }
            }
            begin++;
        }
        return Arrays.asList((T[]) array);
    }
}

