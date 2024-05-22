/**
 * Reverse of an array
 */
public class Array {
    public static void main(String[] args) {

        int[] arr = { 1, 24, 45, 2, 1, 3 };
        int start, end;
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}