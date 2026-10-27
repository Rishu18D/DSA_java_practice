public class LongestIncreasingSubsequence_DP {

    public static void main(String[] args) {

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        int result = lengthOfLIS(nums);

        System.out.println("Longest Increasing Subsequence: " + result);
    }

    public static int lengthOfLIS(int[] nums) {

        int n = nums.length;

        // dp[i] = LIS length ending at index i
        int[] dp = new int[n];

        // Every element can form a subsequence of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build the DP array
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum LIS length
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
