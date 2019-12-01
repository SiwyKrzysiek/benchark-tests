import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void quickSortTest() {
        //Given
        List<Integer> randList = new LinkedList<>();
        List<Integer> sorted;
        Random generator = new Random();

        for (int i = 0; i < 100000; i++) {
            randList.add(generator.nextInt());
        }
        //When
        sorted = new QuickSort().sort(randList);
        //Then
        boolean isSorted = true;
        for (int i = 1; i < 100000; i++) {
            if(sorted.get(i -1) > sorted.get(i))
                isSorted = false;
        }
        assertTrue(isSorted);
    }

}