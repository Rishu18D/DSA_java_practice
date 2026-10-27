import java.util.*;

public class letterCombinationOfPhoneNo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String str = scn.next();

        // Call function and store result
        ArrayList<String> result = letterCombination(str);

        // Print final combinations
        System.out.println(result);

        scn.close();
    }

    // Function to generate all letter combinations
    static ArrayList<String> letterCombination(String str) {

        // Mapping of digits to letters (like phone keypad)
        // Index = digit
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        // Base case: if string is empty
        if (str.length() == 0) {
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");  // return list with empty string
            return baseList;
        }

        // Take first character (digit)
        char ch = str.charAt(0);

        // Remaining string
        String ros = str.substring(1);

        // Recursive call for remaining string
        ArrayList<String> recList = letterCombination(ros);

        // Get corresponding letters for current digit
        String code = mapping[ch - '0'];

        // Final result list
        ArrayList<String> result = new ArrayList<>();

        // Combine current digit letters with recursive result
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            for (int j = 0; j < recList.size(); j++) {
                // Create new combination (DON'T overwrite recList)
                result.add(c + recList.get(j));
            }
        }

        return result;
    }
}