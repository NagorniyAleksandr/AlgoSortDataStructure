package recursion.codingBat;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class TestCodingBat {

    public static void main(String[] args) {





        /*1. --- public int factorial(int n) {
            // Base case: if n is 1, we can return the answer directly
            if (n == 1) return 1;

            // Recursion: otherwise make a recursive call with n-1
            // (towards the base case), i.e. call factorial(n-1).
            // Assume the recursive call works correctly, and fix up
            // what it returns to make our result.
            return n * factorial(n-1);*/



        /* 2. --- public int bunnyEars(int bunnies) {
            if (bunnies == 0) {
                return 0;
            }

            int res = 0;

            return res + 2 + bunnyEars(bunnies -1);
        }*/

        /* 3.

*/


        int[] mas = {1,4,3,5};
        System.out.println(array6(mas, 0));
    }

    /* 4. ---- public static int bunnyEars2(int bunnies){
         if (bunnies != 0) {

             if (bunnies % 2 == 0) {
                 return bunnyEars2(bunnies-1) + 3;
             }
             if (bunnies % 2 == 1) {
                 return bunnyEars2(bunnies-1) + 2;
             }
         }
         return 0;
     }*/
    public static int triangle(int rows) {

        if (rows == 0) return 0;

        return rows + triangle(rows - 1);

    }
    /*sumDigits(126) → 9
    sumDigits(49) → 13
    sumDigits(12) → 3*/

    /*
        public int sumDigits(int n) {

            if (n / 10 == 0) return n;

            return n%10 + sumDigits(n/10);

        }
    */

    /* count7(717) → 2
     count7(7) → 1
     count7(123) → 0*/
    public static int count7(int n) {
        if (n / 7 == 0) return 0;
        return ((n % 10) == 7 ? 1 : 0) + count7(n / 10);
    }

    public int count8(int n) {

        if (n / 8 == 0) return 0;
        if ((n % 100) == 88) {
            return 2 + count8(n / 10);
        } else if ((n % 10) == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

    public static int countX(String str) {
        if (str.length() == 0) return 0;

        return (str.endsWith("x") ? 1 : 0) + countX(str.substring(0, str.length() - 1));
    }

    public static String changeXY(String str) {
        if (str.length() == 0) return "";

        return (changeXY(str.substring(0, str.length() - 1)) + (str.endsWith("x") ? "y" : str.charAt(str.length() - 1)));
    }

    public static String changePi(String str) {
        if (str.length() == 0) return "";

        if (str.endsWith("pi")) {
            return changePi(str.substring(0, str.length() - 2)) + "3.14";
        } else {
            return changePi(str.substring(0, str.length() - 2)) + str.charAt(str.length()-1);
        }
    }

   /* array6([1, 6, 4], 0) → true
    array6([1, 4], 0) → false
    array6([6], 0) → true
    */
    public static boolean array6(int[] nums, int index) {

        if (index >= nums.length) return false;

        if (nums[index] == 6) {
            return true;
        } else {
            return array6(nums, index+1);
        }
    }

}
