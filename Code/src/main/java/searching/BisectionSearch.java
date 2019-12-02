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
        int startIndex = 0;
        int endIndex = data.size() - 1;

        return null;
    }
}
