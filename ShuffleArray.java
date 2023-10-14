
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        Collections.shuffle(arrayList);
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

        for (int i = 0; i < shuffledArray.length; i++) {
            System.out.print(shuffledArray[i]);
            if (i < shuffledArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
