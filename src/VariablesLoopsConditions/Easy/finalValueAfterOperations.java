package VariablesLoopsConditions.Easy;
public class finalValueAfterOperations {
    public static int finalvalue(String[] operations){
        int x=0;

        for(String a:operations){
            if(a.contains("++")){
                x++;
            }
            else{
                x--;
            }
            }
                    return x;


        }
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        int result = finalvalue(operations);
        System.out.println("Final value of x: " + result);
    }
}
