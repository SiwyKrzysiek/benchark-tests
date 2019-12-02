package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import searching.BisectionSearch;
import sorting.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
@Warmup(iterations = 1)
@Measurement(iterations = 2)
public class BisectionSearchMacroTest {
    @Param({ "Bubble sort", "Cocktail sort", "Insertion sort", "Merge sort", "Quick sort" })
    public String algorithmName;

    public final int DATA_SIZE = 500;
    public final List<Integer> data;

    public BisectionSearch<Integer> bisectionSearch;

    {
        data = new Random().ints(DATA_SIZE).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(benchmark.BisectionSearchMacroTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Setup(Level.Iteration)
    public void setup() {
        bisectionSearch = new BisectionSearch<>(sortingAlgorithmFromName(algorithmName));
    }

    private SortingAlgorithm<Integer> sortingAlgorithmFromName(String name) {
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
