package Collection.Easy;
import java.util.HashSet;

class JwelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        
        // Add all jewels to set
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        
        int count = 0;
        
        // Check stones
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        JwelsAndStone solution = new JwelsAndStone();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = solution.numJewelsInStones(jewels, stones);
        System.out.println(result); // Output: 3
    }

}