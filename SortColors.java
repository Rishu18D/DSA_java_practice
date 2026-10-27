import java.util.*;

class SortColors {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n]; // 0-Red 1-White 2-Blue

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        sortColors(arr);

        System.out.print("So the sorted array is: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        scn.close();
    }

    public static void sortColors(int[] nums) {

        int left = 0;
        int current = 0;
        int right = nums.length - 1;

        while (current <= right) {

            if (nums[current] == 0) {

                swap(nums, current, left);
                left++;
                current++;

            } else if (nums[current] == 1) {

                current++;

            } else {

                swap(nums, current, right);
                right--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}