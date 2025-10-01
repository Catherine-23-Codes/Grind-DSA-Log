import java.util.*;

public class RemoveOccurrence2 {
    public static String RemoveCharacters(String s, char ch) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.deleteCharAt(i);
                i--; // adjust index after deletion
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "dsa in java language";
        char ch = 'a';
        System.out.println(RemoveCharacters(word, ch)); // gksforgks
    }
}
