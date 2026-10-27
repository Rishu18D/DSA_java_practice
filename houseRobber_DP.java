import java.util.Scanner;

public class houseRobber_DP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of houses: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the money in each house:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = rob(nums);

        System.out.println("Maximum money that can be robbed: " + result);

        sc.close();
    }

    public static int rob(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return nums[0];
        }

        // DP array
        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
    }
}
