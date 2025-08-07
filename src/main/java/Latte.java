// Inherit from Coffee using the extends keyword
public class Latte extends Coffee {
    // Declare two attributes to store the milk type and syrup flavor (String)
    String milkType;
    String syrupFlavor;

    // Constructor to initialize all attributes
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // Initialize milkType and syrupFlavor using this
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }
    //@Override
    public void grindBeans() {
        System.out.println("Grinding beans for " + name + " (" + roast + " roast)...");
    }
    @Override
    public void brewCoffee() {
        // TODO 12a: simulate brewing coffee for a latte
        System.out.println("Brewing coffee for a latte...");

        // TODO 12b: condition to check if syrupFlavor is selected
        if (!syrupFlavor.equalsIgnoreCase("no") && !syrupFlavor.equalsIgnoreCase("none")) {
            // TODO 12c: simulate adding the syrup
            System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
        }

        // TODO 12d: simulate steaming milk
        System.out.println("Steaming " + milkType + " milk...");

        // TODO 12e: simulate combining coffee and steamed milk
        System.out.println("Combining brewed coffee with steamed milk...");

        // TODO 12f: simulate adding a layer of foam on top
        System.out.println("Adding a layer of foam on top...");
    }
    //@Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Coffee: " + name + ", Roast: " + roast + ", Price: $" + price);
        System.out.println("Latte details: " + milkType + " shots, " + roast + " roast.");
    }
}
