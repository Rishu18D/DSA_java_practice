import java.util.*;

public class Subsets_recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<List<Integer>> res = subsets(a);

        System.out.println("\nAll Subsets:");
        for (List<Integer> s : res) {
            System.out.println(s);
        }

        sc.close();
    }

    public static List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        generate(0, a, new ArrayList<>(), res);
        return res;
    }

    public static void generate(int idx, int[] a, List<Integer> cur,
                                List<List<Integer>> res) {
 
        res.add(new ArrayList<>(cur));

        for (int i = idx; i < a.length; i++) {
            cur.add(a[i]);

            generate(i + 1, a, cur, res);

            cur.remove(cur.size() - 1); // backtrack
        }
    }
}
