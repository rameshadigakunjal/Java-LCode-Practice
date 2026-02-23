package GenericAndWraperClass.Easy;

public class MissingNumber {
    class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        int[] nums = {3, 0, 1};     
        Solution s = m.new Solution();
        int result = s.missingNumber(nums);    
        System.out.println(result);  // Output: 2
    }
    
}
