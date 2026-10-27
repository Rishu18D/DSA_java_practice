import java.util.*;

public class HouseRobber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter money in each house:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum Money = " + rob(nums));

        sc.close();
    }

    static int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        int prev2 = nums[0];

        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {

            int pick = nums[i] + prev2;

            int notPick = prev1;

            int current = Math.max(pick, notPick);

            prev2 = prev1;

            prev1 = current;
        }

        return prev1;
    }
}
