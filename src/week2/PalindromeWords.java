package week2;

public class PalindromeWords {
    public static void main(String[] args) {

        System.out.println(isPalindrome("asa"));


    }


    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
}
