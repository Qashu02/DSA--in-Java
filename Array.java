// Array implementation for max value 
class Array {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 32, 12, 1, 65, 102 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}