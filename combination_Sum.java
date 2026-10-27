import java.util.*;

public class combination_Sum {

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        ArrayList<ArrayList<Integer>> result = combinationSum(candidates, target);

        System.out.println(result);
    }

    static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    static void backtrack(
            int[] candidates,
            int target,
            int index,
            ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (candidates[i] > target) {
                continue;
            }

            current.add(candidates[i]);

            backtrack(
                candidates,
                target - candidates[i],
                i,
                current,
                result
            );

            current.remove(current.size() - 1);
        }
    }
}
