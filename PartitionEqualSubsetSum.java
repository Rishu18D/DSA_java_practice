import java.util.*;

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {

        int[] nums = {1, 5, 11, 5};

        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        // If total sum is odd, equal partition is impossible
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        // dp[s] = can we make sum s?
        boolean[] dp = new boolean[target + 1];

        // Sum 0 is always possible: choose nothing
        dp[0] = true;

        for (int num : nums) {

            // Go backwards so each number is used only once
            for (int sum = target; sum >= num; sum--) {

                dp[sum] = dp[sum] || dp[sum - num];
            }
        }

        return dp[target];
    }
}
