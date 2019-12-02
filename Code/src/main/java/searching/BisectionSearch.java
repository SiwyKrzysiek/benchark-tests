package searching;

import sorting.SortingAlgorithm;

import java.util.List;

public class BisectionSearch<T extends Comparable> {

    private final SortingAlgorithm<T> sortingAlgorithm;

    /**
     *
     * @param sortingAlgorithm Algorithm used to initially sort data
     */
    public BisectionSearch(SortingAlgorithm<T> sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    /**
     * Find object in list
     * @param data  not sorted list
     * @param value value that is equal to the one being searched for by <c>compare()</c>
     * @return found value from the list or <c>null</c> if not found
     */
    public T find(List<T> data, T value) {
        final List<T> sorted = sortingAlgorithm.sort(data);

        int startIndex = 0;
        int endIndex = data.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            final T middleElement = sorted.get(middleIndex);

            if (middleElement.compareTo(value) == 0)
                return middleElement;

            if (middleElement.compareTo(value) > 0)
                endIndex = middleIndex - 1;
            else
                startIndex = middleIndex + 1;
        }

        // Value not found
        return null;
    }
}
