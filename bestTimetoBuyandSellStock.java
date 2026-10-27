import java.util.*;
public class bestTimetoBuyandSellStock {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }

        int result=profit(arr);
        System.out.println("So the maximum profit is "+result); // [7,1,5,3,6,4]
    }
    static int profit(int arr[])
    {
        int min=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++)
        {
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }
        return maxProfit;
    }
    
}
