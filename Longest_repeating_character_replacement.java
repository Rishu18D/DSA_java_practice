import java.util.*;
public class Longest_repeating_character_replacement {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str=scn.next();
        int k=scn.nextInt();

        System.out.println("So the longest repeating character replacement is: "+longestRepeatingCharacterReplacement(str,k));
        
    }
    static int longestRepeatingCharacterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left=0;
        int maxfreq=0;
        int maxLen=0;

        for(int right=0;right<s.length();right++){
            int index=s.charAt(right)-'A';
            freq[index]++;
            maxfreq=Math.max(maxfreq,freq[index]);

            while(right-left+1-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;          
        }
}
