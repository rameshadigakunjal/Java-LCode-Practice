package Collection.Easy;

import java.util.HashSet;

class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        int n = 255;
        boolean result = solution.isHappy(n);
        System.out.println("Is " + n + " a happy number? " + result);
    }
}