package ExceptionHandling.Easy;

public class NumberOfOneBit {
    public class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            count += (n & 1); // check last bit
            n >>= 1;          // shift right
        }

        return count;
    }
}
    public static void main(String[] args) {
        NumberOfOneBit solution = new NumberOfOneBit();
        int n = 11; // Example input (binary: 1011)
        int result = solution.new Solution().hammingWeight(n);
        System.out.println("Number of 1 bits: " + result);
    }
}
