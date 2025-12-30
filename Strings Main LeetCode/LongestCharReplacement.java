public class LongestCharReplacement {
    public static int characterReplacement(String s, int k) {
        int n = s.length(), maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                int len = j - i + 1;
                int changes = len - maxFreq;

                if (changes <= k)
                    maxLen = Math.max(maxLen, len);
                else
                    break;  // no need to expand further for this i!!
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1)); // 4
        System.out.println(characterReplacement("PXQXYPIY", 2));    // 4
    }
}

