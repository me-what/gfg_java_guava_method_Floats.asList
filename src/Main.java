import com.google.common.primitives.Floats;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float arr[] = { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f };
        List<Float> myList = Floats.asList(arr);
        System.out.println(myList);


        float arr2[] = { 3.2f, 5.5f, 7.6f };
        List<Float> myList2 = Floats.asList(arr2);
        System.out.println(myList2);
    }
}