public class Palindrome1 {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Normalize case
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // If loop completes, it's a palindrome
    }

    public static void main(String[] args) {
        String str = "RaceCar";
        System.out.println(isPalindrome(str)); // true
    }
}
