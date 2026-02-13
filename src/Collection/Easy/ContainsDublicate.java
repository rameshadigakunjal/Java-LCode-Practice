package Collection.Easy;

import java.util.HashSet;

public class ContainsDublicate {
    public boolean containsDublicates(int[] nums){
        HashSet<Integer> set =new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDublicate dublicate = new ContainsDublicate();
        int[] value = {1,2,3,4,5,1,1};
        boolean result = dublicate.containsDublicates(value);
        System.out.println("after removeing dublicates: "+result);

    }
    
}
