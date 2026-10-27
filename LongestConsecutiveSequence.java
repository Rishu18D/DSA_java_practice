import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = longestConsecutive(arr);
        System.out.println("So the longest consecutive sequence is "+ans);    
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = 1;
                while (set.contains(num + 1)) {
                    num++;
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
