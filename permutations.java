import java.util.*;

public class permutations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> res = permute(arr);

        System.out.println("\nAll Permutations:");

        for (List<Integer> list : res) {
            System.out.println(list);
        }

        sc.close();
    }


    // Generate all permutations
    public static List<List<Integer>> permute(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        solve(0, arr, res);

        return res;
    }


    // Backtracking
    public static void solve(int idx, int[] arr, List<List<Integer>> res) {

        if (idx == arr.length) {

            List<Integer> list = new ArrayList<>();

            for (int num : arr) {
                list.add(num);
            }

            res.add(list);
            return;
        }


        for (int i = idx; i < arr.length; i++) {

            swap(arr, idx, i);

            solve(idx + 1, arr, res);

            // Backtrack
            swap(arr, idx, i);
        }
    }


    // Swap two elements
    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
