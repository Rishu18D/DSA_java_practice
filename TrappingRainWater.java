import java.util.*;

class TrappingRainWater {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The trapped water is " + trap(arr));
    }

    static int trap(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            if (arr[left] <= arr[right]) {

                leftMax = Math.max(leftMax, arr[left]);

                int trapped = leftMax - arr[left];

                water = water + trapped;

                left++;
            }

            else {

                rightMax = Math.max(rightMax, arr[right]);

                int trapped = rightMax - arr[right];

                water = water + trapped;

                right--;
            }
        }

        return water;
    }
}
