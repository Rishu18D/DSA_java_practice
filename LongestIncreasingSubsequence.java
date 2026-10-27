import java.util.*;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Length of LIS = " + lengthOfLIS(nums));

        sc.close();
    }

    static int lengthOfLIS(int[] nums) {

        ArrayList<Integer> lis = new ArrayList<>();

        for (int num : nums) {

            int index = Collections.binarySearch(lis, num);

            if (index < 0)
                index = -(index + 1);

            if (index == lis.size())
                lis.add(num);
            else
                lis.set(index, num);
        }

        return lis.size();
    }
}
