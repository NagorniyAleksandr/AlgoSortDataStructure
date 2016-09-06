package recursion;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class IntroRec {

    public static void main(String[] args) {

        System.out.println(a4(10));
    }

    // infinite recursion, StackOverFlow
    public static void a1(int num){
        if (num == 0){
            return;
        }
        System.out.println(num);
        a1(num);
    }

    public static void a2(int num){
        if (num == 0){
            return;
        }
        System.out.println(num);
        a2(num - 1);
    }

    public static void a3(int num){
        a3(num - 1);
        if (num == 0){
            return;
        }
        System.out.println(num);
    }

    public static int a4(int num){

        if (num == 0) {
            return 1;
        }

        int returnedRes = a4(num -2);

        return   returnedRes + 1;
    }


}
