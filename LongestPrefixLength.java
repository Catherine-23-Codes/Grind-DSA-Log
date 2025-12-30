import java.util.*;

class LongestPrefixLength1 {
    public static String LongestPrefixLength(String[] strs) {
     // return empty if array is null or empty
        if (strs == null || strs.length == 0)
            return "";

        // take first string as initial prefix
        String prefix = strs[0];

        // compare prefix with all other strings
        for (int i = 1; i < strs.length; i++) {
            // keep shortening prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // no common prefix
                if (prefix.isEmpty())
                    return ""; 
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "float", "flyover", "flight"};
        String result = LongestPrefixLength(words);
        System.out.println("The Longest Common Prefix is: " + result);
    }
}
