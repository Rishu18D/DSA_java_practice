import java.util.*;

public class group_anagram{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = scn.next();
        }

        List<List<String>> result = groupAnagrams(words);
        System.out.println("So the grouped anagrams are:"+result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>(); 
        for(String str : strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str); 
        }

       return new ArrayList<>(map.values());
    }
}