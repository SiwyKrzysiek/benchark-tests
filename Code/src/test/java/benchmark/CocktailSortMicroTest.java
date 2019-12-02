package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
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
public class CocktailSortMicroTest {
    @Param({ "100", "200", "300", "500", "1000" })
    public int dataSize;
    public List<Integer> data;

    public final SortingAlgorithm sortingAlgorithm;

    {
        sortingAlgorithm = new CoctailSort();
    }

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(benchmark.CocktailSortMicroTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Setup(Level.Iteration)
    public void setup() {
        Random random = new Random();
        data = random.ints(dataSize).boxed().collect(Collectors.toList());
    }

    @Benchmark
    public void benchmark(benchmark.InsertionSortMicroTest plan) {
        sortingAlgorithm.sort(data);
    }
}
