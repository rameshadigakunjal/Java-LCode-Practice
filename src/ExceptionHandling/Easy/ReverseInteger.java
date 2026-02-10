package ExceptionHandling.Easy;
public class ReverseInteger {
     public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // check overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        int input = 123;
        int reversed = solution.reverse(input);
        System.out.println("Reversed integer: " + reversed);
    }
}
