import java.util.List;

/**
 * Generalization of sorting algorithm
 */
public interface SortingAlgorithm<T extends Comparable> {
    /**
     * Create sorted copy of given data list
     * @param data Data to be sorted
     * @return Sorted data
     */
     List<T> sort(List<T> data);
}
