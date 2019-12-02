package Benchmark;

import java.util.*;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
@Warmup(iterations = 3)
@Measurement(iterations = 8)
public class BubbleSortMicroTest{

    @Param({"10000000"})
    private int N;

    List<Integer> inputList;


    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(BubbleSortMicroTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Setup
    public void setup() {
        Random mRandom = new Random();
        inputList = new ArrayList<Integer>();

        for(int i = 0; i<12; i++){
            int number = mRandom.nextInt();
            inputList.add(number);
        }

    }

    @Benchmark
    public void innerLoopFor(Blackhole bh) {

        boolean done = true;

        do {
            done = true;
            for (int i = 0; i < inputList.size() - 1; i++) {
                if (inputList.get(i).compareTo(inputList.get(i + 1)) > 0) {
                    int temp = inputList.get(i);
                    inputList.set(i, inputList.get(i + 1));
                    inputList.set(i + 1, temp);
                    done = false;
                }
            }
        }while(!done);
    }

    @Benchmark
    public void innerLoopWhile(Blackhole bh) {

        boolean done = true;

        do {
            done = true;
            int i = 0;
            while (i < inputList.size() - 1) {
                if (inputList.get(i).compareTo(inputList.get(i + 1)) > 0) {
                    int temp = inputList.get(i);
                    inputList.set(i, inputList.get(i + 1));
                    inputList.set(i + 1, temp);
                    done = false;
                }
                i++;
            }
        }while(!done);
    }

}