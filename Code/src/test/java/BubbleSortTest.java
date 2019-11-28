import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    @Test
    void BubbleSortTestSortUnsorted()
    {
        List<Integer> testList = (List<Integer>) Arrays.asList(14, 3, 1, 7, 12, 4, 2);
        List<Integer> resultList = BubbleSort.sort(testList);

        assertEquals(testList, resultList);
    }

    @Test
    void BubbleSortTestSortSorted()
    {
        List<Integer> testList = (List<Integer>) Arrays.asList(1, 2, 3, 4, 7, 12, 14);
        List<Integer> resultList = BubbleSort.sort(testList);

        assertEquals(testList, resultList);
    }
}
