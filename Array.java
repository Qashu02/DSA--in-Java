/**
 * Array
 */
public class Array {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String[] args) {
        Array arr = new Array();
        arr.printArray(new int[] { 1, 3, 5, 6, 4, 6, 2 });
    }

}