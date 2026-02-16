

public class String_to_Integer {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        
        // 1️⃣ Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2️⃣ Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3️⃣ Convert digits
        long result = 0;  // use long to detect overflow

        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // 4️⃣ Handle overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
    public static void main(String[] args) {
        String_to_Integer converter = new String_to_Integer();
        String input = "   -42";
        int result = converter.myAtoi(input);
        System.out.println("Converted integer: " + result);
    }
    
}
