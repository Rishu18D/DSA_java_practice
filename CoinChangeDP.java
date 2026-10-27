import java.util.Scanner;

public class CoinChangeDP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter coin values:");

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int result = coinChange(coins, amount);

        System.out.println("Minimum coins needed: " + result);

        sc.close();
    }

    // Dynamic Programming solution
    public static int coinChange(int[] coins, int amount) {

        // dp[i] = minimum number of coins needed
        // to make amount i
        int[] dp = new int[amount + 1];

        // Fill dp with a value larger than any possible answer
        int max = amount + 1;

        for (int i = 0; i <= amount; i++) {
            dp[i] = max;
        }

        // Base case
        dp[0] = 0;

        // Calculate minimum coins for every amount
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i) {
                    dp[i] = Math.min(
                        dp[i],
                        dp[i - coin] + 1
                    );
                }
            }
        }

        // If amount cannot be formed
        if (dp[amount] == max) {
            return -1;
        }

        return dp[amount];
    }
}
