package time_test;

import sort.SortUtils;
import utils.time.ITimeAction;
import utils.time.TimeCounter;

import java.util.Arrays;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class TestSorting {

    public static void main(String[] args) {
        int[] mas = new int[100_000];

        int[] copy1 = Arrays.stream(mas).map((e) -> (int)(Math.random()* 1000)).toArray();
        int[] copy2 = Arrays.copyOf(copy1, copy1.length);

        System.out.println("start bubble sort");
        long res = TimeCounter.count(new BubbleSortTimeAction(mas));
        System.out.println("Bubble sort time " + res);


        System.out.println("start linear sort");
        // local anonym class
        ITimeAction innerSortJava = new ITimeAction() {
            @Override
            public void doAction() {
                Arrays.sort(mas);
            }
        };

        System.out.println("start Arrays sort");
        long arraysSortRes = TimeCounter.count(innerSortJava);
        System.out.println("Arrays sort time " + arraysSortRes);

    }
}

class BubbleSortTimeAction implements ITimeAction{

    private  int[] mas;

    public BubbleSortTimeAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(mas);
    }
}
