package easy.arrays;

import java.util.Arrays;

public class RunningSumof1DArray {

    public int[] runningSum(int[] nums){
        int sum = 0;
        for(int i = 1; i<nums.length;i++){
            sum = nums[i] + nums[i-1];
            nums[i] = sum;
        }
        return nums;
    }
    public static void main(String[] args) {
        RunningSumof1DArray rArray = new RunningSumof1DArray();

        int[] nums = {1,2,3,4};
        int[] result = rArray.runningSum(nums);

        System.out.println(Arrays.toString(result));
         


       
    }
}




/*
1 | 2 | 3 | 4    after ading 
|   |   |   |
1 | 3 | 6 | 10  


sum = prev element + current elemet  -> sum = nums[i] + nums[i-1]
                                        nums[i] = sum

*/