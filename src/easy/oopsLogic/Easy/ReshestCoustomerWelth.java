
package easy.oopsLogic.Easy;
public class ReshestCoustomerWelth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int wealth : customer) {
                currentWealth += wealth;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int result = maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + result);
    }
}