public class LongestPalindromicSubstring_DP {

    public static void main(String[] args) {

        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println("Longest Palindromic Substring: " + result);
    }

    public static String longestPalindrome(String s) {

        int n = s.length();

        if (n <= 1) {
            return s;
        }

        boolean[][] dp = new boolean[n][n];

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int length = 2; length <= n; length++) {

            for (int i = 0; i <= n - length; i++) {

                int j = i + length - 1;

                if (s.charAt(i) == s.charAt(j)) {

                    if (length == 2 || dp[i + 1][j - 1]) {

                        dp[i][j] = true;

                        if (length > maxLength) {
                            maxLength = length;
                            start = i;
                        }
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
