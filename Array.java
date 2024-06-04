
/**
 * TO find the missing number from the range 
 */
import java.util.*;

public class Array {
    public void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static int FindMissingNumber(int[] arr) {

        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public void arrayDemo() {
        int[] b = new int[] { 1, 2, 4, 3, 7, 5 };

        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
            System.out.println();

        }
        System.out.println(" " + FindMissingNumber(b));
    }

    public static void main(String[] args) {
        Array a = new Array();
        a.arrayDemo();

    }

}