import java.util.*;
public class Max_product_subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int result = maxProduct(arr);
        System.out.println("Maximum Product of Subarray is " + result);
    }

    static int maxProduct(int arr[]) {
        int max = arr[0]; //max product
        int min = arr[0]; //min product
        int result = arr[0]; //result
        for (int i = 1; i < arr.length; i++) {
            
            // if current element is negative then swap
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
