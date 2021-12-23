import java.util.Scanner;

public class Take2 {
    public static void main(String[] arges) {
        final String[] products = { "MilkShake", "Oreo", "Orange", "Apple", "Frappe" };
        final int[] prices = { 30000, 35000, 25000, 25000, 35000 };
        String[] choice = {};

        System.out.println("Here is our Menu!!");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i]);
            System.out.println(" = " + prices[i]);
        }

        System.out.println("Please put your oder (:!!!");
        Scanner scan = new Scanner(System.in);
        String order = scan.nextLine();

        while (!order.equals("no")) {
            System.out.println("Another pick?");
            order = scan.nextLine();
        }

        theTotal method = new theTotal();
        System.out.println(method.theTotal(order));

    }

}
