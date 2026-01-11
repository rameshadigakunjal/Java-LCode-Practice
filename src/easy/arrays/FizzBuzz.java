package easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 15;
        List<String> result = fizzBuzz.fizzBuzz(n);
        System.out.println(result);
        
    }
}




/* 
basic:

for loop --
if(is3 && is5) --- FizzBuzz
else(is3) ----Fizz
else(is5) ----Buzz
else ---
*/ 

/*
ANOTHER WAY:
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();

        boolean is3,is5;

        for(int i = 1;i<=n;i++){
            is3 = i%3 == 0;
            is5 = i%5 == 0;

            if(is3 && is5){
                list.add("FizzBuzz");
            }
            else if(is3){
                list.add("Fizz");
            }
            else if(is5){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }

        return list;

    }
} */