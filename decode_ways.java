import java.util.*;

public class decode_ways {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the encoded string: ");
        String s = sc.nextLine();

        int result = numDecodings(s);

        System.out.println("Number of ways: " + result);

        sc.close();
    }

    public static int numDecodings(String s) {
        
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 1; i < s.length(); i++) {
            int current = 0;

            if (s.charAt(i) != '0') {
                current += prev1;
            }

            int twoDigit = (s.charAt(i - 1) - '0') * 10
                         + (s.charAt(i) - '0');

            if (twoDigit >= 10 && twoDigit <= 26) {
                current += prev2;
            }

            prev2 = prev1;
            prev1 = current;

            if (prev1 == 0) {
                return 0;
            }
        }

        return prev1;
    }

}
