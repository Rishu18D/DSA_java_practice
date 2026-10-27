import java.util.Scanner;

public class climbing_stairsDP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int result = climbStairs(n);

        System.out.println("Number of ways: " + result);

        sc.close();
    }

    // Dynamic Programming solution
    public static int climbStairs(int n) {

        // dp[i] = number of ways to reach stair i
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        // DP transition
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
