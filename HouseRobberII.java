public class HouseRobberII {

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        int answer = rob(nums);

        System.out.println("Maximum money: " + answer);
    }

    public static int rob(int[] nums) {

        int n = nums.length;

        // Only one house
        if (n == 1) {
            return nums[0];
        }

        // Case 1: Don't rob the last house
        int firstCase = robHouses(nums, 0, n - 2);

        // Case 2: Don't rob the first house
        int secondCase = robHouses(nums, 1, n - 1);

        return Math.max(firstCase, secondCase);
    }

    public static int robHouses(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        dp[start] = nums[start];

        if (start + 1 <= end) {
            dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        }

        for (int i = start + 2; i <= end; i++) {

            dp[i] = Math.max(
                dp[i - 1],
                dp[i - 2] + nums[i]
            );
        }

        return dp[end];
    }
}