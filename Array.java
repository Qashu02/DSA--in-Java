// Array implementation fr minvalue 
class Array {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 32, 12, 1 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}