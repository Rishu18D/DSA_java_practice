import java.util.*;

public class PalindromicSubstrings {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(
            "Number of palindromic substrings are "
            + countPalindromicSubstrings(str)
        );
    }


    static int countPalindromicSubstrings(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            // Check odd-length palindromes
            int oddCount = checkpalindrome(str, i, i);
            count = count + oddCount;

            // Check even-length palindromes
            int evenCount = checkpalindrome(str, i, i + 1);
            count = count + evenCount;
        }

        return count;
    }


    static int checkpalindrome(String str, int start, int end) {

        int count = 0;

        while (
            start >= 0 &&
            end < str.length() &&
            str.charAt(start) == str.charAt(end)
        ) {

            start--;
            end++;
            count++;
        }

        return count;
    }
}
