package EnumsAndInnerClass;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        int columnNumber = 28; // Example input
        String result = solution.convertToTitle(columnNumber);
        System.out.println(result); // Output: "AB"
    }
}
