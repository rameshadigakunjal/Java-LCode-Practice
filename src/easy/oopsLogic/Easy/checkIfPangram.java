package easy.oopsLogic.Easy;
public class checkIfPangram {
    public boolean checkIfPangram1(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        checkIfPangram cp = new checkIfPangram();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";    
        System.out.println(cp.checkIfPangram1(sentence)); // Output: true   
        String sentence2 = "leetcode";    
        System.out.println(cp.checkIfPangram1(sentence2)); // Output: false 

    }
}
