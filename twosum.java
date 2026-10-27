import java.util.*;

public class twosum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int t = scn.nextInt();

        Arrays.sort(arr); 
        twoSum(arr, t);
    }

    static void twoSum(int arr[], int t) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == t) {
                System.out.println(arr[left] + " " + arr[right]);
                left++;  
                right--;
            } 
            else if (sum < t) {
                left++;  
            } 
            else {
                right--;  
            }
        }
    }
}