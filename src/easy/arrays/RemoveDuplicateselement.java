package easy.arrays;
public class RemoveDuplicateselement {
    public static int removeDublicate(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,2};
        System.out.println(removeDublicate(nums));
    }
}


/*current elemet and next element both are same to continue (ignore this)

if(i<nums.length-1 && nums[i] == nums[i+1]

example:
{1,1,2,2,3}
 | | | | |
 0 1 2 3 4

i=0 1=1 (True)   ---->curent_ele=1 and nest_ele = 1   ignore it because(dublicate elements)
i=1 1=2 (false)  ---->curent_ele=1 and next_ele= 2   save it  
i=2 2=2 (True)   ----->continue
i=3 2=3 (False)  ---> save it
i=4 3=next element X getoutof bound    {  ---if(i<nums.length-1)---   }


how to save :
int count = 0;
nums[count] = nums[i];

{1,}
*/