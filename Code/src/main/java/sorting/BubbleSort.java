package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort<T extends Comparable> implements SortingAlgorithm<T> {

    @Override
    public List<T> sort(List<T> data) {
        int length = data.size();
        boolean done = true;

        Comparable[] copyData = data.toArray(new Comparable[0]);

        do{
            done = true;
            for(int i = 0; i<length - 1; i++)
            {
                if(copyData[i].compareTo(copyData[i+1]) > 0)
                {
                    Comparable<T> temp = copyData[i];
                    copyData[i] = copyData[i+1];
                    copyData[i+1] = temp;
                    done = false;
                }
            }
        }while(!done);

        return Arrays.asList((T[]) copyData);
    }
}