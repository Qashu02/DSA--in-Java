/**
 * Reverse of an array
 */
public class Array {
    public static void main(String[] args) {

        int[] arr = { 1, 24, 45, 2, 1, 3 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}