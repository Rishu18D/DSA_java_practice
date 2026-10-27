import java.util.*;

public class longest_palindromicSubstring {

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

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = checkPalindrome(str, i, i);       
            int len2 = checkPalindrome(str, i, i + 1);

            int len = Math.max(len1, len2);

            // Update the longest palindrome found so far
            if (len > end - start +1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
 
        return str.substring(start, end + 1);
    }

    static int checkPalindrome(String str, int start, int end) {

        while (start >= 0 &&
               end < str.length() &&
               str.charAt(start) == str.charAt(end)) {

            start--;
            end++;
        }

        return end - start - 1;
    }
}