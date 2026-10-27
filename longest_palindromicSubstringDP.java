import java.util.*;

public class longest_palindromicSubstringDP {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println("Longest palindromic substring is "
                + longestPalindromicSubstring(str));
    }

    static String longestPalindromicSubstring(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        int n = str.length();

        boolean[][] dp = new boolean[n][n];

        int start = 0;
        int maxLength = 1;

        // Length 1: Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check substrings of length 2, 3, 4, ...
        for (int length = 2; length <= n; length++) {

            for (int i = 0; i <= n - length; i++) {

                int j = i + length - 1;

                if (str.charAt(i) == str.charAt(j)) {

                    if (length == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && length > maxLength) {

                    start = i;
                    maxLength = length;
                }
            }
        }

        return str.substring(start, start + maxLength);
    }
}
