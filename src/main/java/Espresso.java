public class Espresso {
    String espressoName;
    String espressoRoast;
    double espressoPrice;
    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        this.espressoName = name;
        this.espressoRoast = roast;
        this.espressoPrice = price;
        this.numberOfShots = numberOfShots;
    }
    public void grindBeans() {
        System.out.println("Grinding beans for " + espressoName + " (" + espressoRoast + " roast)...");
    }
    public void brewCoffee() {
        System.out.println("Brewing " + numberOfShots + " shot(s) of " + espressoName + "...");
    }
    public void printInfo() {
        System.out.println("Coffee: " + espressoName + ", Roast: " + espressoRoast + ", Price: $" + espressoPrice);
    }
    public void printEspressoDetails() {
        System.out.println("Espresso details: " + numberOfShots + " shots, " + espressoRoast + " roast.");
    }
}
