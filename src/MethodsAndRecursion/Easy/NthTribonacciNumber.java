package MethodsAndRecursion.Easy;

public class NthTribonacciNumber {

    //T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
    public int tribonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a=0,b=1,c=1;
        for(int i=3;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
    }
    return c;
    }
    public static void main(String[] args) {
        NthTribonacciNumber solution = new NthTribonacciNumber();
        int n = 25;
        int result = solution.tribonacci(n);
        System.out.println(result);
    }

    
}
