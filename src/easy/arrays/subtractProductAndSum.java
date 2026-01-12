package easy.arrays;

public class subtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
    public static void main(String[] args) {
        subtractProductAndSum s = new subtractProductAndSum();
        int n = 234;
        int result = s.subtractProductAndSum(n);
        System.out.println(result);
    }
}





/*product = 2*3*4 = 24
sum = 2+3+4 = 9
result = product - sum
24 - 9 = 15

*/
