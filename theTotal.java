import java.lang.reflect.Array;
import java.util.Arrays;

public class theTotal extends Take2 {
    int[] total = {};
    final int[] prices = { 30000, 35000, 25000, 25000, 35000 };
    int sum = 0;

    public int theTotal(String order) {

        switch (order) {
            case "MilkShake":
                System.arraycopy(prices, 0, total, 0, 5);
                break;
            case "Oreo":
                System.arraycopy(prices, 1, total, 1, 5);
                break;
            case "Orange":
                System.arraycopy(prices, 2, total, 2, 5);
                break;
            case "Apple":
                System.arraycopy(prices, 3, total, 3, 5);
                break;
            case "Frappe":
                System.arraycopy(prices, 4, total, 4, 5);
                break;
        }

        System.out.println(total[0]);
        for (int i = 0; i < total.length; i++) {
            sum = sum + total[i];
        }
        System.out.print("Here's your check: ");
        return sum;
    }

}
