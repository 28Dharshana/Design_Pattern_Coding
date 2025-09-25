// Step 1: Component interface
interface Coffee {
    String getDescription();
    double getCost();
}

// Step 2: Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0; // base cost
    }
}

// Step 3: Decorator abstract class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}

// Step 4: Concrete Decorators
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0;
    }
}

// Step 5: Testing the Decorator Pattern
public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add Milk
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add Sugar
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add Chocolate
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
