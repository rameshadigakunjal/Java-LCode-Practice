package GenericAndWraperClass.Easy;



public class ValidPerfectSquare {
    class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;

        while (num > 0) {
            num -= i;
            i += 2;
        }

        return num == 0;
    }
}
    public static void main(String[] args) {
        ValidPerfectSquare solution = new ValidPerfectSquare();
        int num = 16;
        boolean result = solution.new Solution().isPerfectSquare(num);
        System.out.println(result); // Output: true
    }
}