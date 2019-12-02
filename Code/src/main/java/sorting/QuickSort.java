package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort <T extends Comparable> implements SortingAlgorithm<T>{

    @Override
    public List<T> sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        quickSort(array, 0, list.size() - 1);
        return Arrays.asList((T[]) array);
    }

    private void quickSort(Comparable[] A, int lo, int hi) {
        if( lo < hi ) {
            int p = partition(A, lo, hi);
            quickSort(A, lo, p - 1);
            quickSort(A, p + 1, hi);
        }
    }

    private int partition(Comparable[] A, int lo, int hi) {
        Comparable pivot = A[hi];
        int  i = lo;
        for( int j = lo; j < hi; j++) {
            if(A[j].compareTo(pivot) < 0){
                swap(A, i, j);
                i++;
            }
        }
        swap(A, i, hi);
        return i;
    }
    private void swap(Comparable[] A, int a, int b){
        Comparable buff = A[a];
        A[a] = A[b];
        A[b] = buff;
    }
}
