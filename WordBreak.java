import java.util.*;

public class WordBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter dictionary words separated by space: ");
        String[] words = sc.nextLine().split(" ");

        List<String> wordDict = Arrays.asList(words);

        boolean result = wordBreak(s, wordDict);

        System.out.println("Can be segmented: " + result);

        sc.close();
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dict = new HashSet<>(wordDict);

        boolean[] dp = new boolean[s.length() + 1];

        // Empty string can always be formed
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
