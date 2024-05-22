import java.util.*;

class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 0;
        arr[3] = 5;
        arr[2] = 3;
        arr[4] = 3;
        arr[0] = 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i] + " ");
        }
        System.out.println();
    }
}