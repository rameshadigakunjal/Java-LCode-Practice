package EnumsAndInnerClass;

public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        NimGame game = new NimGame();
        int n = 4; // Example input
        boolean result = game.canWinNim(n);
        System.out.println(result); // Output: false
    }
    
}
