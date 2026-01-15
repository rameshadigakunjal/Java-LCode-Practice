package easy.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int i=0;i<nums.length;i++){
        int req_no = target - nums[i];
        if(hm.containsKey(req_no)){
            int [] arr={hm.get(req_no),i};
            return arr;
        }
        hm.put(nums[i],i);
    }
    return null;

    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        //System.out.println(twoSum(nums,9));
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
    
}


/*
{3,2,4}, target={6} 

6-3 =3          (3,0), (2,1), (4,2)
6-2 =4
6-4 =2
*/