public class Espresso extends Coffee {
    // Attribute to store the number of shots (int)
    int numberOfShots;

    // Constructor to initialze all attributes
    public Espresso(String name, String roast, double price, int numberOfShots) {
        // Use super to call the Coffee constructor
        super (name, roast, price);
        // Initialize numberOfShots using this
        this.numberOfShots = numberOfShots;
    }
    // Override the grindBeans() method
    @Override
    public void grindBeans() {
        System.out.println("Grinding beans for " + name + " (" + roast + " roast)...");
    }
    // Override the brewCoffee() method
    @Override
    public void brewCoffee() {
        System.out.println("Brewing " + numberOfShots + " shot(s) of " + name + "...");
    }
    // Override the printInfo() method
    @Override
    public void printInfo() {
        super.printInfo();  // Call parent method to print common details
        System.out.println("You asked for " + numberOfShots + " serving(s)!");
        System.out.println("Each shot costs $" + price + ". Your total bill is $" + (price * numberOfShots) + ".");
    }
}
