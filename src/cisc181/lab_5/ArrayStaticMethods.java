package cisc181.lab_5;

/**
 * a class for ArrayStaticMethods
 */
public class ArrayStaticMethods {

    /**
     * returned double is the average of all values in data
     *
     * @param data array for double
     * @return the average
     */
    public static double mean(double[] data) {
        double sum = 0;
        for (double datum : data) {
            sum += datum;
        }
        return sum / data.length;
    }

    /**
     * Given a an array of characters, compute how many elements are either a lower or uppercase 'M'.
     *
     * @param chars array for char
     * @return number for m&&M
     */
    public static int countM(char[] chars) {
        int ans = 0;
        for (char i :
                chars) {
            if (i == 'm' || i == 'M') {
                ans++;
            }

        }
        return ans;
    }

    /**
     * produces a new array with exactly the same contents as the parameter, except that all occurrences of value1 have been replaced with value2.
     *
     * @param values the array that  replace in
     * @param value1 the value that be replaced
     * @param value2 the value which become
     * @return new array which have been replaced
     */
    public static int[] replace(int[] values, int value1, int value2) {
        int length = values.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            if (values[i] == value1) {
                ans[i] = value2;
            } else {
                ans[i] = values[i];
            }
        }
        return ans;
    }

    /**
     * all the zero value are grouped at the start of the array. The order of the non-zero numbers  be the same as the original array.
     *
     * @param arr int[] original array
     * @return a new array that all 0 in start and other number in original order
     */
    public static int[] padZeros(int[] arr) {
        int length = arr.length;
        int[] ans = new int[length];
        int count = 0,j = 0;
        for (int i :
                arr) {
            if (i == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            ans[i] = 0;
        }
        for (int i = count; i < length; ++i) {
            if (arr[j] == 0) {
                j++;
                i--;
            } else {
                ans[i] = arr[j];
                j++;
            }
        }
        return ans;
    }
}
