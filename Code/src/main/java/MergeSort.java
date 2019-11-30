import java.util.Arrays;
import java.util.List;

public class MergeSort<T extends Comparable> implements SortingAlgorithm<T> {

    @Override
    public List<T> sort(List<T> list) {
        Comparable[] array = list.toArray(new Comparable[0]);
        divide(array, 0, list.size() - 1);
        return Arrays.asList((T[]) array);
    }

    private void divide(Comparable[] array, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;

            divide(array, l, m);
            divide(array, m + 1, r);

            merge(array, l, m, r);
        }
    }

    private void merge(Comparable[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Comparable[] leftArray = new Comparable[n1];
        Comparable[] rightArray = new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = array[m + 1 + i];
        }

        int i, j;
        i = j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) < 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        for (; i < n1; i++, k++)
            array[k] = leftArray[i];
        for (; i < n2; i++, k++)
            array[k] = rightArray[i];
    }
}
