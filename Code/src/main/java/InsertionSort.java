import java.util.Arrays;
import java.util.List;

public class InsertionSort implements SortingAlgorithm<Integer> {

    @Override
    public List<Integer> sort(List<Integer> data) {
        Integer[] array = data.toArray(new Integer[0]);

        for (int i = 1; i < array.length; i++) {
            Integer current = array[i]; //Save current

            int j = i-1;
            while (j >= 0 && array[j].compareTo(current) > 0) {
                array[j + 1] = array[j]; //Shift table
                j--;
            }

            array[j + 1] = current; //Put back
        }
        
        return Arrays.asList(array);
    }
}
