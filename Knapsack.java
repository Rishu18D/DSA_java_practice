import java.util.*;

public class Knapsack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];

        System.out.println("Enter weights:");

        for (int i = 0; i < n; i++)
            weight[i] = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++)
            value[i] = sc.nextInt();

        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();

        System.out.println("Maximum Value = "
                + knapsack(weight, value, capacity));

        sc.close();
    }

    static int knapsack(int[] weight,
                        int[] value,
                        int capacity) {

        int n = weight.length;

        int[] dp = new int[capacity + 1];

        for (int w = weight[0]; w <= capacity; w++) {
            dp[w] = value[0];
        }

        for (int i = 1; i < n; i++) {

            // Traverse backwards
            for (int w = capacity; w >= weight[i]; w--) {

                dp[w] = Math.max(dp[w],
                        value[i] + dp[w - weight[i]]);
            }
        }

        return dp[capacity];
    }
}
