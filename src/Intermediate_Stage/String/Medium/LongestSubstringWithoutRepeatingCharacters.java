package Intermediate_Stage.String.Medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
            LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
            String input = "abcabcbb";
            int result = solution.lengthOfLongestSubstring(input);
            System.out.println("Length of the longest substring without repeating characters: " + result);
    }
   
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character already exists, remove from left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}


