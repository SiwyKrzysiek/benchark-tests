import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeSortTest {
    @Test
    void mergeSortTest() {
        //Given
        List<Integer> checker = new ArrayList<>();
        List<Integer> toSort = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            checker.add(new Random().nextInt(1000000));
            toSort.add(checker.get(i));
        }
        checker.sort(Comparator.comparingInt(o -> o));

        //When
        toSort = new MergeSort().sort(toSort);

        //Then
        boolean sorted = true;
        for (int i = 0; i < 1000000; i++) {
            if (!checker.get(i).equals(toSort.get(i))) {
                sorted = false;
                break;
            }
        }
        assertTrue(sorted);
    }

}