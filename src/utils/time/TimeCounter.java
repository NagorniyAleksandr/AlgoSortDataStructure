package utils.time;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class TimeCounter {
    public static long count(ITimeAction action){

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return end - start;
    }
}
