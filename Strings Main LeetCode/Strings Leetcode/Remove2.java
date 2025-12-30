public class Remove2 {
    public static String removeCharAtPosition(String s, int pos) {
        if (pos < 0 || pos >= s.length()) {
            return s; // return unchanged if invalid
        }
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void main(String[] args) {
        String s = "abcde";
        int pos = 1;
        System.out.println(removeCharAtPosition(s, pos));
    }
}

