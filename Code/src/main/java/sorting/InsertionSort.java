package sorting;

import java.util.Arrays;
import java.util.List;

public class InsertionSort<T extends Comparable> implements SortingAlgorithm<T> {

    @Override
    public List<T> sort(List<T> data) {
        Comparable[] array = data.toArray(new Comparable[0]);

        for (int i = 1; i < array.length; i++) {
            Comparable current = array[i]; //Save current

            int j = i-1;
            while (j >= 0 && array[j].compareTo(current) > 0) {
                array[j + 1] = array[j]; //Shift table
                j--;
            }

            array[j + 1] = current; //Put back
        }

        return Arrays.asList((T[]) array);
    }
}
