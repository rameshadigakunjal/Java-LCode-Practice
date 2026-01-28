package easy.arrays.Medium;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        int[] result = obj.productExceptSelf(nums);
        for(int val : result){
            System.out.print(val + " ");
        }
        
    }
    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int ans[] = new int[n];
        int ProductL = 1;
        int ProductR = 1;


        for(int i= n-1;i>=0; i--){
            ans[i]  = ProductR;
            ProductR = ProductR*nums[i];
        }
        for(int i = 0; i<n; i++){
            ans[i] = ans[i]*ProductL;
            ProductL = ProductL*nums[i];
        }
        return ans;
    }
}

/*for example {1,2,3,4}

Product of Array Except Self:

left  : [1,  1,   2,   6]
         |   |    |    |
Right : [24, 12,  4,   1] 

Result: [24, 12, 8, 6] 



result = left * Right */
