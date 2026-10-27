import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int arr[]) {
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (visited.contains(arr[i])) {
                return true;
            } else {
                visited.add(arr[i]);
            }
        }
        return false;
    }
}
