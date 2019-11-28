import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);
        quickSort(array, 0, list.size() - 1);
        return new ArrayList<>(Arrays.asList(array));
    }

    private void quickSort(Integer[] A, int lo, int hi) {
        if( lo < hi ) {
            int p = partition(A, lo, hi);
            quickSort(A, lo, p - 1);
            quickSort(A, p + 1, hi);
        }
    }

    private int partition(Integer[] A, int lo, int hi) {
        int pivot = A[hi];
        int  i = lo;
        for( int j = lo; j < hi; j++) {
            if(A[j] < pivot){
                swap(A, i, j);
                i++;
            }
        }
        swap(A, i, hi);
        return i;
    }
    private void swap(Integer[] A, int a, int b){
        int buff = A[a];
        A[a] = A[b];
        A[b] = buff;
    }
}
