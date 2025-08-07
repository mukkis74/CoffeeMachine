public class CoffeeMaker {

    public void prepareCoffee(Coffee coffee) {
        System.out.println("Starting coffee preparation...");
        coffee.grindBeans();    // Polymorphic call
        coffee.brewCoffee();    // Polymorphic call
        coffee.printInfo();     // Polymorphic call
        System.out.println("Coffee preparation complete.\n");
    }
}
