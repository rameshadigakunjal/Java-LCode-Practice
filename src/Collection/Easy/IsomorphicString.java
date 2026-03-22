package Collection.Easy;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return s == t;
        }

        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[Character.MAX_VALUE + 1];
        int[] mapT = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) return false;

            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }
    public static void main(String[] args) {
        IsomorphicString solution = new IsomorphicString();
        String s = "egg";
        String t = "add";
        boolean result = solution.isIsomorphic(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" isomorphic? " + result);
    }
}
