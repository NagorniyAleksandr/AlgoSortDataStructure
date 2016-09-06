package time_test;

import utils.time.ITimeAction;
import utils.time.TimeCounter;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class TestStringBuilder {

    public static void main(String[] args) {

        int count = 10000;
        long strBuilderCont = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    sb.append(sb);
                }
            }
        });

        System.out.println("StringBuilder concat " + strBuilderCont);

        long strCont = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                String res = "";
                for (int i = 0; i < count; i++) {
                    res = res + i;
                }
            }
        });
        //String immutable class

        System.out.println("String concat " + strCont);


    }
}
