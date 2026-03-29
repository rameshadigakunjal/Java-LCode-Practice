
package EnumsAndInnerClass;


class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        
        return result;
    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        String columnTitle = "AB"; // Example input
        int result = solution.titleToNumber(columnTitle);
        System.out.println(result); // Output: 28
    }
}