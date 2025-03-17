abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Store base coffee
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    public double getCost() {
        return coffee.getCost();
    }  //they are needed to add cost and description for different add-ons
    public String getDescription() {
        return coffee.getDescription();
    }
}

// Decorator for adding alternative milk
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 500; // If they ask for alternative milk, we add another 500 tenge to the price.
    }
    public String getDescription() {
        return super.getDescription() + " with added alterntaive milk"; // Adding a description for alternative milk
    }
}

// Decorator for adding syrup
class SyrupDecorator extends CoffeeDecorator {
     String syrupType; // Type of syrup (chocolate, salted caramel, etc.)
    public SyrupDecorator(Coffee coffee, String syrupType) {
        super(coffee);
        this.syrupType = syrupType;
    }
    public double getCost() {
        return super.getCost() + 300; // if you ask for any kind of syrup (chocolate, caramel, salted caramel) we add another 300 tenge to the price
    }
    public String getDescription() {
        return super.getDescription() + " with added " + syrupType + " syrup"; // Добавляем описание выбранного сиропа
    }
}

// Декоратор для добавления взбитых сливок
class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 300; // for whipped cream on top we add another 300 to the price
    }
    public String getDescription() {
        return super.getDescription() + " with added whipped cream";
    }
}

// Decorator for adding chocolate
class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 300; // Decorator for adding chocolate,and we add 300 to the price for chocolate
    }

    public String getDescription() {
        return super.getDescription() + " with added chocolate ";
    }
}

//Takes user input for coffee selection and toppings.
//Calculates the final cost dynamically based on the selected options