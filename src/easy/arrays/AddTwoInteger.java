package easy.arrays;
public class AddTwoInteger {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        AddTwoInteger  addnum = new AddTwoInteger();
        int result = addnum.sum(5, 10);
        System.out.println("Sum: " + result);

        int result2 = addnum.sum(-3, 7);
        System.out.println("Sum: " + result2);
    }
}
