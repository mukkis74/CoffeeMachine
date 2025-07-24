public class Latte {
    String latteName;
    String latteRoast;
    String syrupFlavor;
    String milkType;
    double lattePrice;

    public Latte(String name, String roast, String flavor, String type, double price) {
        this.latteName = name;
        this.latteRoast = roast;
        this.syrupFlavor = flavor;
        this.milkType = type;
        this.lattePrice = price;
    }
    public void grindBeans() {
        System.out.println("Grinding beans for " + latteName + " (" + latteRoast + " roast)...");
    }
    public void brewCoffee() {
        System.out.println("Brewing " + milkType + " shot(s) of " + latteName + "milkType " + milkType);
    }
    public void printInfo() {
        System.out.println("Coffee: " + latteName + ", Roast: " + latteRoast + ", Price: $" + lattePrice);
    }
    public void printLatteDetails() {
        System.out.println("Latte details: " + milkType + " shots, " + latteRoast + " roast.");
    }
}
