import java.util.*;

public class ClimbingStairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int stairs = sc.nextInt();

        System.out.println("Total Ways = " + climbStairs(stairs));

        sc.close();
    }

    static int climbStairs(int stairs) {

        // If there are only 1 or 2 stairs,
        // the number of ways is equal to the number of stairs.
        if (stairs <= 2) {
            return stairs;
        }

        // Ways to reach stair 1
        int waysAtFirst = 1;

        // Ways to reach stair 2
        int waysAtSecond = 2;

        // Calculate ways from stair 3 to the last stair
        for (int stair = 3; stair <= stairs; stair++) {

            // Ways to reach the current stair
            int waysAtCurrent = waysAtFirst + waysAtSecond;

            // Move the previous answers forward
            waysAtFirst = waysAtSecond;
            waysAtSecond = waysAtCurrent;
        }

        // Final answer
        return waysAtSecond;
    }
}
