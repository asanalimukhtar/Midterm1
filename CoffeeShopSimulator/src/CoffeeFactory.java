public class CoffeeFactory {
    // here we create an object of the required type of coffee
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Unknown coffee type"); // If the type is unknown, an error will be thrown automatically
        }
    }
}
//Coffee Shop Simulator
//This system allows customers to order coffee with optional toppings using the Decorator Pattern. The CoffeeFactory class helps create different coffee types, and decorators allow adding toppings dynamically.
//Uses the Factory Pattern to create coffee objects
//Implements the Decorator Pattern for adding toppings