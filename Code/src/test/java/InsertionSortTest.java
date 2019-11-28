import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    void sortSmallArrayOfDoubles() {
        // Given
        List<Double> data = Arrays.asList(0.0001, 6.22, 6.15, -3.2);

        // When
        SortingAlgorithm algorithm = new InsertionSort();
        List<Double> sorted = algorithm.sort(data);

        // Then
        List<Double> expected = Arrays.asList(-3.2, 0.0001, 6.15, 6.22);
        assertEquals(expected, sorted);
    }

    @Test
    void sortShortString() {
        // Given
        String letters = "ddacb";
        List<Character> data = letters.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

        // When
        SortingAlgorithm algorithm = new InsertionSort();
        String sorted = (String) algorithm.sort(data).stream().map(String::valueOf).collect(Collectors.joining());

        // Then
        String expected = "abcdd";
        assertEquals(expected, sorted);
    }
}