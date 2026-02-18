package Collection.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArrays_II {
     public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count elements of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Check nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert List to Array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        IntersectionofTwoArrays_II solution = new IntersectionofTwoArrays_II();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = solution.intersect(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }   
    }
}
