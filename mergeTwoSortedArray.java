import java.util.*;

public class mergeTwoSortedArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Take first array
        int n = scn.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        // Take second array
        int m = scn.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        // Merge both arrays
        int[] result = merge(arr1, arr2);

        // Print result
        System.out.println("The merged array is:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }


    static int[] merge(int[] arr1, int[] arr2) {

        // Create an array to store the answer
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;  // position in arr1
        int j = 0;  // position in arr2
        int k = 0;  // position in result


        // Compare elements of both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                result[k] = arr1[i];

                i++;
                k++;

            } else {

                result[k] = arr2[j];

                j++;
                k++;
            }
        }


        // If elements are left in arr1
        while (i < arr1.length) {

            result[k] = arr1[i];

            i++;
            k++;
        }


        // If elements are left in arr2
        while (j < arr2.length) {

            result[k] = arr2[j];

            j++;
            k++;
        }


        return result;
    }
}
