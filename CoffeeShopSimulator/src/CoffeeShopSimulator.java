import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose coffee: ");
        String cof = in.nextLine();
        Coffee coffee = CoffeeFactory.createCoffee(cof);

        while (true) {
            System.out.println("Wanna add toppings? (milk, chocolate, salted caramel, vanilla, hazelnut, or no): ");
            String topping = in.nextLine().toLowerCase();

            if (topping.equals("no"))
                break;

            if (topping.equals("milk")) {
                coffee = new MilkDecorator(coffee); // add alternative milk
            } else if (topping.equals("chocolate") ||
                    topping.equals("salted caramel") ||
                    topping.equals("vanilla") ||
                    topping.equals("hazelnut")) {
                coffee = new SyrupDecorator(coffee, topping); // add selected syrup

            } else {
                System.out.println("There is no such topping!");
            }
        }

        // TOTAL
        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total Price: " + coffee.getCost());
    }
}