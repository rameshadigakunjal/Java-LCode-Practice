package easy.String.Easy;

public class DetectCapitalLetter {
    class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }
            return false;

    }
    
}
public static void main(String[] args) {
    DetectCapitalLetter solution = new DetectCapitalLetter();
    String input = "USA";
    boolean result = solution.new Solution().detectCapitalUse(input);
    System.out.println("Is Capital Use Correct: " + result);
}
}
