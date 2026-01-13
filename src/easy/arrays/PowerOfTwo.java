package easy.arrays;
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        int count = Integer.bitCount(n);
        if(count==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        int n = 16;
        boolean result = p.isPowerOfTwo(n);
        System.out.println(result);
    }
    
}
