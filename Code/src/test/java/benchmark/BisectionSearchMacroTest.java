package benchmark;

import org.openjdk.jmh.annotations.*;
import sorting.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
@Warmup(iterations = 1)
@Measurement(iterations = 2)
public class BisectionSearchMacroTest {
    @Param({ "Bubble sort", "Cocktail sort", "Insertion sort", "Merge sort", "Quick sort" })
    public String algorithmName;

    private SortingAlgorithm sortingAlgorithmFromName(String name) {
        if (name.equals("Bubble sort"))
            return new BubbleSort();
        if (name.equals("Cocktail sort"))
            return new CoctailSort();
        if (name.equals("Insertion sort"))
            return new InsertionSort();
        if (name.equals("Merge sort"))
            return new MergeSort();
        if (name.equals("Quick sort"))
            return new QuickSort();

        throw new IllegalArgumentException("Wrong sorting algorithm name");
    }
}
