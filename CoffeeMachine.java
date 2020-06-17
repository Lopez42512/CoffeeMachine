import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Amount of ingredients need for a cup of coffee
        int waterForOneCupOfCoffee = 200; // Amount in ml
        int milkForOneCupOfCoffee = 50; // Amount in ml
        int coffeeBeanForOneCupOfCoffee = 15; // Amount in grams

        // Getting inital amount of ingredients in coffee machine
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInCoffeeMachine = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInCoffeeMachine = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansInCoffeeMachine = scan.nextInt();

        // How many cups of coffee ordered
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffeeOrdered = scan.nextInt();

        // Determine how many cups of coffee the machine can make with the ingredients
        // it has
        int howManyCoffeeCupsWeCanMakeFromWater = waterInCoffeeMachine / waterForOneCupOfCoffee;
        int howManyCoffeeCupsWeCanMakeFromMilk = milkInCoffeeMachine / milkForOneCupOfCoffee;
        int howManyCoffeeCupsWeCanMakeFromCoffeeBeans = coffeeBeansInCoffeeMachine / coffeeBeanForOneCupOfCoffee;

        int howManyCupsCanBeMade = howManyCoffeeCupsWeCanMakeFromWater < howManyCoffeeCupsWeCanMakeFromMilk
                ? howManyCoffeeCupsWeCanMakeFromWater < howManyCoffeeCupsWeCanMakeFromCoffeeBeans
                        ? howManyCoffeeCupsWeCanMakeFromWater
                        : howManyCoffeeCupsWeCanMakeFromCoffeeBeans
                : howManyCoffeeCupsWeCanMakeFromMilk < howManyCoffeeCupsWeCanMakeFromCoffeeBeans
                        ? howManyCoffeeCupsWeCanMakeFromMilk
                        : howManyCoffeeCupsWeCanMakeFromCoffeeBeans;

        if (howManyCupsCanBeMade == cupsOfCoffeeOrdered) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (howManyCupsCanBeMade > cupsOfCoffeeOrdered) {
            int cupsLeftedOver = howManyCupsCanBeMade - cupsOfCoffeeOrdered;
            System.out.println("Yes, I can make that amount of coffee (and even "  + cupsLeftedOver + " more than that)");
        } else {
            System.out.println("No, I can make only" + howManyCupsCanBeMade + "cup(s) of coffee");
        }

        scan.close();
    }
}