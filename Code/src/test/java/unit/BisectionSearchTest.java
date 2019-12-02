package unit;

import org.junit.jupiter.api.Test;
import searching.BisectionSearch;
import sorting.InsertionSort;
import sorting.SortingAlgorithm;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BisectionSearchTest {

    @Test
    void findIntegerWithInsertionSortTargetInData() {
        // Given
        SortingAlgorithm sortingAlgorithm = new InsertionSort();
        List<Integer> data = Arrays.asList(4, 2, 1, 7, 3, 5, 4, 28, 6, -8);
        Integer target = 4;

        // When
        BisectionSearch<Integer> bisectionSearch = new BisectionSearch<>(sortingAlgorithm);
        Integer result = bisectionSearch.find(data, target);

        // Then
        assertEquals(target, result);
    }

    @Test
    void findIntegerWithInsertionSortTargetNOTInData() {
        // Given
        SortingAlgorithm sortingAlgorithm = new InsertionSort();
        List<Integer> data = Arrays.asList(4, 2, 1, 7, 3, 5, 4, 28, 6, -8);
        Integer target = 11;

        // When
        BisectionSearch<Integer> bisectionSearch = new BisectionSearch<>(sortingAlgorithm);
        Integer result = bisectionSearch.find(data, target);

        // Then
        assertNull(result);
    }
}