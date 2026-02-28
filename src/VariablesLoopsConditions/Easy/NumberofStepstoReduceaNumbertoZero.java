
package VariablesLoopsConditions.Easy;
public class NumberofStepstoReduceaNumbertoZero {
public static int numberOfSteps(int num) {
    int steps = 0;
    while (num > 0) {
        if (num % 2 == 0) {
            num /= 2; // If the number is even, divide it by 2
        } else {
            num -= 1; // If the number is odd, subtract 1
        }
        steps++; // Increment the step count
    }
    return steps;
}
public static void main(String[] args) {
    int num = 14;
    int result = numberOfSteps(num);
    System.out.println("Number of steps to reduce " + num + " to zero: " + result);
}
}