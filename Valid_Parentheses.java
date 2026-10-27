import java.util.*;
import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println("String is valid or not: " + validParentheses(str));
    }

    static boolean validParentheses(String str) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening bracket
            if (map.containsKey(ch)) {
                st.push(ch);
            } 
            // Closing bracket
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if (map.get(top) != ch) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}