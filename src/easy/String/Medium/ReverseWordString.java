package easy.String.Medium;

public class ReverseWordString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; // skip spaces
            
            if (i < 0) break;
            
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--; // find word
            
            sb.append(s.substring(i + 1, j + 1)).append(" ");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        ReverseWordString solution = new ReverseWordString();
        String s = "Hello World";
        String result = solution.reverseWords(s);
        System.out.println("Reversed Words: " + result);
    }
}

