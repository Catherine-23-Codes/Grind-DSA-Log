import java.util.*;
public class generateParantheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String curr, int open, int close, int max) {
        // Base case: if the current string is of valid length
        if (curr.length() == max * 2) {
            result.add(curr);
            return;
        }

        // Add '(' if we still can
        if (open < max)
            backtrack(result, curr + "(", open + 1, close, max);

        // Add ')' if valid to do so
        if (close < open)
            backtrack(result, curr + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> ans = generateParenthesis(n);
        System.out.println("All valid parentheses combinations for n = " + n + ":");
        System.out.println(ans);
    }
}

