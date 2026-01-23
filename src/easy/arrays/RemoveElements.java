package easy.arrays;
//LEETCODE PROBLEM 27
public class RemoveElements {
    
static int removeElement(int[] nums, int val) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val) {
            continue;
        } else {
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}



// if current element is equal to val then continue (ignore this element)
// else save the element at count index and increment count

// example:
// {3,2,2,3}    
//  | | | |
//  0 1 2 3
// i=0 3=3 (true) ----> continue
// i=1 2=3 (false) ----> save it
// i=2 2=3 (false) ----> save it
// i=3 3=3 (true) ----> continue


