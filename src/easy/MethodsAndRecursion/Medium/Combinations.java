package easy.MethodsAndRecursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> temp) {
        // base case
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);               // choose
            backtrack(i + 1, n, k, temp); // explore
            temp.remove(temp.size() - 1); // un-choose
        }
    }
}
    public static void main(String[] args) {
        Combinations.Solution solution = new Combinations().new Solution();
        int n = 4, k = 2;
        List<List<Integer>> result = solution.combine(n, k);
        System.out.println(result);
    }
}
