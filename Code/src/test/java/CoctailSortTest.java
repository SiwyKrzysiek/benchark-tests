import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoctailSortTest {
    @Test
    void sortInt() {

        List<Integer> data = Arrays.asList(2, 3, 1, 5, 1, 6, 6, 10, 12, 123421, 11, 421, 12526423, 2);

        SortingAlgorithm algorithm = new CoctailSort();
        List<Integer> sorted = algorithm.sort(data);

        List<Integer> expected = Arrays.asList(1, 1, 2, 2, 3, 5, 6, 6, 10, 11, 12, 421, 123421, 12526423);
        assertEquals(expected, sorted);
    }

    @Test
    void duzoIntow() {
        // Given
        List<Integer> lista = new ArrayList<>();
        //sortData
        for (int i = 9999; i >= 0; i--) {
            lista.add(i);
        }

        // ExpectData
        List<Integer> listaEx = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            listaEx.add(i);
        }
        SortingAlgorithm algorithm = new CoctailSort();
        List<Integer> sorted = algorithm.sort(lista);

        assertEquals(listaEx, sorted);


    }

}