package GenericAndWraperClass.Easy;

import java.util.Scanner;

class convertNumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            result.append(hex[num & 15]);  // last 4 bits
            num >>>= 4;  // unsigned right shift
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
        convertNumberToHexadecimal solution = new convertNumberToHexadecimal();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = solution.toHex(num);
        System.out.println(result); // Output: "1a"
    }
}
