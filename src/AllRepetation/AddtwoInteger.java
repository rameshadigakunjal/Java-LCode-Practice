package AllRepetation;

public class AddtwoInteger {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        AddtwoInteger  addnum = new AddtwoInteger();

        int result1 = addnum.sum(5, 10);
        System.out.println("Sum: " + result1);    
        int result2 = addnum.sum(-3, 7);
        System.out.println("Sum: " + result2);

        
    }
}
