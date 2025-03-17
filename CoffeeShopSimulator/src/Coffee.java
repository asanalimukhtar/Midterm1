// Interface for all types of coffee (each coffee has a price and description)
public interface Coffee {
    double getCost();
    String getDescription();
}

// Specific coffee classes, showing what type of coffee it is
class Espresso implements Coffee {
    public double getCost() {
        return 800;
    }
    public String getDescription() {
        return "Espresso";
    }
}

class Cappuccino implements Coffee {
    public double getCost() {
        return 1200;
    }
    public String getDescription() {
        return "Cappuccino";
    }
}

class Latte implements Coffee {
    public double getCost() {
        return 1300;
    }
    public String getDescription() {
        return "Latte";
    }
}

class Americano implements Coffee {
    public double getCost() {
        return 1000;
    }
    public String getDescription() {
        return "Americano";
    }
}

