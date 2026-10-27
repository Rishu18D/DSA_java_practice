import java.util.*;

public class Lngst_ss_WithoutRepeatingChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println("Longest substring without repeating characters is " + longestSubstring(str));

    }
    static int longestSubstring(String str) {
        int left = 0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            char currectChar = str.charAt(right);
            while (set.contains(currectChar)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
