package easy.MethodsAndRecursion.easy;

public class Fibonacci {
     public int fib(int n) {
        if(n<=1){
            return n;
        }   

        //memoization
        int[] map = new int[n+1];

        map[0]  = 0;
        map[1] = 1;

        for(int i=2; i<=n ;i++){
            map[i] = map[i-1] + map[i-2];
        }
        return map[n];

        
            }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(5);
        System.out.println("Fibonacci of 5 is: " + result);
    }
}
