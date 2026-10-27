import java.util.*;

public class topKfrequentElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        int[] result = topKFrequent(arr, k);

        for (int num : result)
            System.out.print(num + " ");

        sc.close();
    }


    public static int[] topKFrequent(int[] arr, int k) {

        // 1. Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);


        // 2. Put numbers into frequency buckets
        ArrayList<Integer>[] bucket = new ArrayList[arr.length + 1];

        for (int num : map.keySet()) {

            int freq = map.get(num);

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();

            bucket[freq].add(num);
        }


        // 3. Get top k
        int[] answer = new int[k];
        int index = 0;

        for (int freq = arr.length; freq >= 1 && index < k; freq--) {

            if (bucket[freq] != null) {

                for (int num : bucket[freq]) {
                    answer[index] = num;
                    index++;

                    if (index == k)
                        break;
                }
            }
        }

        return answer;
    }
}
