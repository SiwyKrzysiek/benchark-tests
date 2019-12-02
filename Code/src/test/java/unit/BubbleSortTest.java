package unit;

import org.junit.jupiter.api.Test;
import sorting.BubbleSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    @Test
    void BubbleSortTestSortIntegerUnsorted()
    {
        BubbleSort mBubbleSort = new BubbleSort();

        List<Integer> testList = (List<Integer>) Arrays.asList(1, 2, 3, 7, 7, 12, 14);
        List<Integer> inputList = (List<Integer>) Arrays.asList(14, 3, 1, 7, 12, 7, 2);
        List<Integer> resultList = (List<Integer>)mBubbleSort.sort(inputList);

        assertEquals(testList, resultList);
    }

    @Test
    void BubbleSortTestSortIntegerSorted()
    {
        BubbleSort mBubbleSort = new BubbleSort();

        List<Integer> testList = (List<Integer>) Arrays.asList(1, 2, 3, 4, 7, 12, 14);
        List<Integer> inputList = (List<Integer>) Arrays.asList(1, 2, 3, 4, 7, 12, 14);
        List<Integer> resultList = (List<Integer>)mBubbleSort.sort(inputList);

        assertEquals(testList, resultList);
    }

    @Test
    void BubbleSortTestSortStringUnsorted()
    {
        BubbleSort mBubbleSort = new BubbleSort();

        List<String> testList = (List<String>) Arrays.asList("2","ala", "baca", "baca", "warsztat", "warsztatownik", "warsztatowy");
        List<String> inputList = (List<String>) Arrays.asList("ala", "baca", "warsztat", "warsztatowy", "baca", "warsztatownik", "2");
        List<Integer> resultList = (List<Integer>)mBubbleSort.sort(inputList);

        assertEquals(testList, resultList);
    }

    @Test
    void BubbleSortTestSortStringSorted()
    {
        BubbleSort mBubbleSort = new BubbleSort();

        List<String> testList = (List<String>) Arrays.asList("2","ala", "baca", "baca", "warsztat", "warsztatownik", "warsztatowy");
        List<String> inputList = (List<String>) Arrays.asList("2","ala", "baca", "baca", "warsztat", "warsztatownik", "warsztatowy");
        List<Integer> resultList = (List<Integer>)mBubbleSort.sort(inputList);

        assertEquals(testList, resultList);
    }
}


