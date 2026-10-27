import java.util.*;

public class productofArrayExceptSelf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int result[] = productExceptSelf(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
    static int[] productExceptSelf(int[] nums) {
       int result[] = new int[nums.length];
       int pre=1;
       int post =1;
       //prefix array
       for(int i=0;i<nums.length;i++)
       {
           result[i]=pre;
           pre=pre*nums[i];
       }
       //postfix array
       for(int i=nums.length-1;i>=0;i--)
       {
           result[i]=result[i]*post;
           post=post*nums[i];
       }
       return result;
    }
}
