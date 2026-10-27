import java.util.*;

public class ContainsDuplicateII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Array input
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        // Function call
        boolean ans = containsNearbyDuplicate(nums, k);

        // Output
        System.out.println(ans);

        sc.close();
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Check if number already exists
            if (map.containsKey(nums[i])) {

                // Check distance
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            } 

            // Store latest index
            map.put(nums[i], i);
        }

        return false;
    }
}