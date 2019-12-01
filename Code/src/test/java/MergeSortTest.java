import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeSortTest {
    @Test
    void mergeSortTest() {
        //Given
        List<Integer> randomNumbers = new Random().ints(1000000).boxed().collect(Collectors.toList());

        //When
        List<Integer> result = new MergeSort().sort(randomNumbers);

        //Then
        List<Integer> sorted = randomNumbers.stream().sorted().collect(Collectors.toList());
        assertEquals(sorted, result);
    }

}