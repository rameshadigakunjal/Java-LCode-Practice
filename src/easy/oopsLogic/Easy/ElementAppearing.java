package easy.oopsLogic.Easy;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearing {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int target = arr.length / 4;

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) > target) {
                return num;
            }
        }
        return -1;
    }



    
    public static void main(String[] args) {
        ElementAppearing ea = new ElementAppearing();
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(ea.findSpecialInteger(arr)); // Output: 6    
}
}