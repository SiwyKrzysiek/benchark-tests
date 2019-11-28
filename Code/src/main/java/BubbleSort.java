import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static List<Integer> sort (List<Integer> list)
    {
        int length = list.size();

        boolean done = true;

        do{
            done = true;
            for(int i = 0; i<length-1; i++)
            {
                if(list.get(i)>list.get(i+1))
                {
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    done = false;
                }
            }

        }while (done == false);

        return list;
    }
}
