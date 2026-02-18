package Collection.Easy;

public class FirstUniqueCharacteriaString {
    public int firstUniqChar(String s) {

        int[] count = new int[26];

        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Step 2: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        FirstUniqueCharacteriaString solution = new FirstUniqueCharacteriaString();
        String s = "leetcode";
        int result = solution.firstUniqChar(s);
        System.out.println("First unique character index: " + result);
    }
}


