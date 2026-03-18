package ExceptionHandling.Easy;
public class ReverseBits {
    
    
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Shift result left to make space
            result <<= 1;

            // Add last bit of n
            result |= (n & 1);

            // Shift n right
            n >>= 1;
        }

        return result;
 
    }
    public static void main(String[] args) {
        ReverseBits solution = new ReverseBits();
        int n = 43261596; // Example input
        int result = solution.reverseBits(n);
        System.out.println("Reversed Bits: " + result);
    }
}
