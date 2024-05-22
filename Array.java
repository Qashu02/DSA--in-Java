/**
 * Array that removes the even integers and count the number of odds
 */
public class Array {
    public static void main(String[] args) {

        int[] arr = { 8, 3, 4, 1, 4, 5, 6, 0 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
                count++;
            }

        }
        System.out.println("\n Numbers of odds in an array :" + count);
    }

}