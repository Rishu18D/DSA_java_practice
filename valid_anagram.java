import java.util.*;

class valid_anagram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        String target = scn.next();

        System.out.println("So the anagram is :" + validAnagram(str, target));
    }

    public static boolean validAnagram(String str, String target) {

        if (str.length() != target.length()) {
            return false;
        }

        int arr[] = new int[26];

        for (int i = 0; i < str.length(); i++) {

            // Take character from str
            char ch1 = str.charAt(i);

            // Find its position in the array
            int index1 = ch1 - 'a';

            // Increase its count
            arr[index1]++;


            // Take character from target
            char ch2 = target.charAt(i);

            // Find its position in the array
            int index2 = ch2 - 'a';

            // Decrease its count
            arr[index2]--;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
