package easy.arrays;
public class MAxConcegetiveOnce {
public int maxOnce(int[] nums){
    int count=0;
    int maxOncefor=0;
    for(int num:nums){
        if(num==1){
            count++;
            maxOncefor=Math.max(maxOncefor, count);
        }
        else{
            count=0;
        }

    }
    return maxOncefor;
}

public static void main(String[] args) {
    MAxConcegetiveOnce solution = new MAxConcegetiveOnce();
    int[] nums = {1, 1, 0, 1, 1, 1, 0, 1};
    int result = solution.maxOnce(nums);
    System.out.println(result);
}
}