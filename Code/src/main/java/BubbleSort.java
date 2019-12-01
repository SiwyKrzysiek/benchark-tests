import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable> implements SortingAlgorithm<T> {

    @Override
    public List<T> sort(List<T> data) {
        int length = data.size();
        boolean done = true;

        do{
            done = true;
            for(int i = 0; i<length - 1; i++)
            {
                if(data.get(i).compareTo(data.get(i+1)) > 0)
                {
                    T temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                    done = false;
                }
            }
        }while(!done);

        return data;
    }
}
