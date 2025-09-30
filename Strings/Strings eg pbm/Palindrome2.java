public class Palindrome2 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
    }
}

