import java.util.Scanner;

public class min_cost_climbing_stairsDP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int[] cost = new int[n];

        System.out.println("Enter cost of each stair:");

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int result = minCostClimbingStairs(cost);

        System.out.println("Minimum cost: " + result);

        sc.close();
    }

    // Dynamic Programming solution
    public static int minCostClimbingStairs(int[] cost) {

        // dp[i] = minimum cost to reach stair i
        int[] dp = new int[cost.length + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 0;

        // DP transition
        for (int i = 2; i <= cost.length; i++) {

            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],
                dp[i - 2] + cost[i - 2]
            );
        }

        return dp[cost.length];
    }
}
