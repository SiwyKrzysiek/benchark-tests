import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sortSmallArrayOfIntegers() {
        // Given
        List<Integer> data = Arrays.asList(7, 2, 4, 6);

        // When
        SortingAlgorithm algorithm = new InsertionSort();
        List<Integer> sorted = algorithm.sort(data);

        // Then
        List<Integer> expected = Arrays.asList(2, 4, 6, 7);
        assertEquals(expected, sorted);
    }
}