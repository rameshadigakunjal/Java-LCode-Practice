package easy.arrays;
public class mejoritynumber {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
           // count += (num == candidate) ? 1 : -1;
           if(num==candidate){
            count++;
           }
           else{
            count--;
           }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
}