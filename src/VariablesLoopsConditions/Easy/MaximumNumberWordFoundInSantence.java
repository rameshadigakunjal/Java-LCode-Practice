package VariablesLoopsConditions.Easy;

public class MaximumNumberWordFoundInSantence {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String s : sentences) {
            int words = 1;  // At least one word

            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    words++;
                }
            }

            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
    public static void main(String[] args) {
        MaximumNumberWordFoundInSantence solution = new MaximumNumberWordFoundInSantence();
        String[] sentences = {"Hello world", "This is a test", "Java programming"};
        int result = solution.mostWordsFound(sentences);
        System.out.println("Maximum number of words in a sentence: " + result);
    }
}

