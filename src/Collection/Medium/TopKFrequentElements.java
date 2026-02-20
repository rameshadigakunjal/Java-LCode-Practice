package Collection.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Max heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        // Step 3: Extract top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
    public static void main(String[] args) {
        TopKFrequentElements s = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] topK = s.topKFrequent(nums, k);
        // Print the result
        for (int num : topK) {
            System.out.print(num + " ");
        }
    }
}

