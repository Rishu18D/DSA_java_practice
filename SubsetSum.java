import java.util.Scanner;

public class SubsetSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean answer = subsetSum(arr, target);

        System.out.println("Answer: " + answer);

        sc.close();
    }

    static boolean subsetSum(int[] arr, int target) {

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : arr) {

            for (int sum = target; sum >= num; sum--) {

                if (dp[sum - num] == true) {
                    dp[sum] = true;
                }
            }
        }

        return dp[target];
    }
}
