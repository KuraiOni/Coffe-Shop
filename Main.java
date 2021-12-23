import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] arges) {
        HashMap<String, Integer> Menu = new HashMap<>();
        int x = 0;
        int[] total = new int[1000];
        int sum = 0;

        Menu.put("MilkShake", 30000);
        Menu.put("MilkShake-Oreo", 35000);
        Menu.put("Frappe", 35000);
        Menu.put("Lemonade", 25000);
        Menu.put("Apple", 25000);
        Menu.put("Orange", 25000);
        Menu.put("Fruit-Mix", 30000);
        Menu.put("Press here if your done or don't want to order (:", 0);

        System.out.println("Good Morning Sir...Here is out Menu!! Choose what you like!!");

        for (String i : Menu.keySet()) {
            System.out.print(i);
            System.out.println(" = " + Menu.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        String order = "";

        while (!order.equals("Press here if your done or don't want to order (:")) {
            order = scanner.nextLine();
            total[x] = Menu.get(order);
            sum = sum + total[x];
            x++;
        }

        System.out.println("Here's your check: " + sum);

        // switch (order) {
        // case "MilkShake":
        // System.out.println("Your price is: " + Menu.get("MilkShake") + " L.L.");
        // break;
        // case "MilkShake-Oreo":
        // System.out.println("Your price is: " + Menu.get("MilkShake-Oreo") + " L.L.");
        // break;
        // case "Frappe":
        // System.out.println("Your price is: " + Menu.get("Frappe") + " L.L.");
        // break;
        // case "Lemonade":
        // System.out.println("Your price is: " + Menu.get("Lemonade") + " L.L.");
        // break;
        // case "Apple":
        // System.out.println("Your price is: " + Menu.get("Apple") + " L.L.");
        // break;
        // case "Orange":
        // System.out.println("Your price is: " + Menu.get("Orange") + " L.L.");
        // break;
        // case "Fruit-Mix":
        // System.out.println("Your price is: " + Menu.get("Fruit-Mix") + " L.L.");
        // break;
        // }

        // for (int i = 0; i < total.length; i++) {
        // total[i] = Menu.get(order);
        // sum = sum + total[i];
        // }

    }

}
