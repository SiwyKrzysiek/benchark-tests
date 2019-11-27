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
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

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
            if (leftArray[i] <= rightArray[j]) {
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
