package easy.oopsLogic.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = 0;

        if(ruleKey.equals("type")) {
            index = 0;
        } 
        else if(ruleKey.equals("color")) {
            index = 1;
        } 
        else {
            index = 2;
        }

        int count = 0;

        for(List<String> item : items) {
            if(item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
public static void main(String[] args) {
      List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println("Matching items: " + result);
    
}
}
