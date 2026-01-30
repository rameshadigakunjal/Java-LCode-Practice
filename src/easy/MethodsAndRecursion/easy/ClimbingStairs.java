package easy.MethodsAndRecursion.easy;

public class ClimbingStairs {

    public int climbStair(int n){
        if(n<=3){
            return n;
        }
        int a=3;
        int b=2;
        for(int i=0;i<n-3;i++){
            a=a+b;
            b=a-b;
        }
        return a;
    }
    public static void main(String[] args) {
        ClimbingStairs c = new ClimbingStairs();
        int result = c.climbStair(5);
        System.err.println(result);
    }
}

//70leetcode - Climbing Stairs
/*

n=1
->1
n=2
-> 1+1
n=3
-> 1+2, 2+1, 1+1+1
n=4
-> 1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2
n=5
-> 1+1+1+1, */
