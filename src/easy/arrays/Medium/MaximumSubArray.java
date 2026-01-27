package easy.arrays.Medium;

public class MaximumSubArray {

    static int maxArray(int[] nums) {
        // Kadane's algorithm to find maximum subarray sum in O(n)
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxArray(nums)); // Output: 6
    }
}
