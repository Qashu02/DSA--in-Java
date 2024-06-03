// sending 0's to end of an Array
/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 34, 0, 10, 7, 1, 5, 0, 23 };
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

            if (arr[j] != 0) {
                j++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n" + arr[i]);

        }

    }
}