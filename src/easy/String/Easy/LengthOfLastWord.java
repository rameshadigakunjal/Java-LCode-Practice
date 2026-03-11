package easy.String.Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        String input = "Hello World";
        int result = solution.lengthOfLastWord(input);
        System.out.println("Length of Last Word: " + result);
    }}

