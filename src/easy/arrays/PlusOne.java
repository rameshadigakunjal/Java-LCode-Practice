package easy.arrays;

class PLusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

public class PlusOne {
    public static void main(String[] args) {
        PLusOne solution = new PLusOne();
        int[] digits = {9, 9, 9};   
        int[] result = solution.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
