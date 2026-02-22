package GenericAndWraperClass.Easy;

public class Sqrt {
    public int mySqrt(int x) {

        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == x)
                return mid;

            if (square < x) {
                ans = mid;        // store possible answer
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.mySqrt(4));  // Output: 2
        System.out.println(sqrt.mySqrt(8));  // Output: 2
        
    }
}
