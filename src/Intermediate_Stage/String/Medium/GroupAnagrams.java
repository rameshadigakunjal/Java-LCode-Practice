package Intermediate_Stage.String.Medium;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);                 // sort characters
            String key = new String(arr);     // use sorted string as key
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
    
public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
