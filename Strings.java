// Checknig the string is palindrome or not
public class Strings {
    public boolean isPalindrome(String word) {

        char[] c = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        for (int i = 0; i < c.length; i++) {
            if (start < end) {

                if (c[start] != c[end]) {
                    return false;
                }
                end--;
                start++;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String word = "feef";
        Strings s = new Strings();
        s.isPalindrome(word);
        if (s.isPalindrome(word) == true) {
            System.out.println("  String is palindrome");
        } else {

            System.out.println("String is not palindrome");
        }

    }

}
