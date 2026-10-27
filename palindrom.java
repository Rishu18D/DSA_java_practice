import java.util.*;

class palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(Palindrom(str));
    }

    static boolean Palindrom(String str) {
        // Handle empty or null strings
        if (str == null || str.length() == 0) {
            return true; 
        }

        int l = 0;
        int r = str.length() - 1;

        while (l < r) {
            // Use charAt() to access characters in a String
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}