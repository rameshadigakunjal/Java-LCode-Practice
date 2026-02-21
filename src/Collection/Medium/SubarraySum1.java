package Collection.Medium;

public class SubarraySum1 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1);  // Important: handles subarrays starting at index 0

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        SubarraySum1 s = new SubarraySum1();
        int[] nums = {1, 1, 1};     
        int k = 2;
        int result = s.subarraySum(nums, k);    
        System.out.println(result);  // Output: 2


    }
}


