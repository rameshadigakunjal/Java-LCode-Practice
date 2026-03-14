package easy.String.Easy;

public class rotateString {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()){
            return false;
        }

        String temp = s + s;

        if(temp.contains(goal)){
            return true;
        }

        return false;
    }
public static void main(String[] args) {
    rotateString solution = new rotateString();
    String s = "abcde";
    String goal = "cdeab";
    boolean result = solution.rotateString(s, goal);
    System.out.println("Is Rotation: " + result);
}
}
