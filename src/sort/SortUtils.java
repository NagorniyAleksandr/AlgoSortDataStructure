package sort;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class SortUtils {

    public static void selectionSort(int[] mas) {
        if (mas == null || mas.length == 0) {
            return;
        }

        for (int j = 0; j < mas.length; j++) {
            int minI = j;
            for (int i = j + 1; i < mas.length; i++) {
                if (mas[minI] > mas[i]) {
                    minI = i;
                }
            }
            swap(mas, j, minI);

        }



    }

    public static void swap(int[] mas, int i, int j){
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }

}
