package VariablesLoopsConditions.Easy;

public class StringShuffle {

    public static String restoreString(String s, int[] indices) {
    //     char[] shuffled = new char[s.length()];
    //     for (int i = 0; i < s.length(); i++) {
    //         shuffled[indices[i]] = s.charAt(i);
    //     }
    //     return new String(shuffled);
    // 
        StringBuilder shuffled = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            shuffled.setCharAt(indices[i], s.charAt(i));
        }
        return shuffled.toString();  
}


    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String result = restoreString(s, indices);
        System.out.println("Restored string: " + result);
    }
    
}
