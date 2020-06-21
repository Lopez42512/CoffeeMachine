import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    // Amount of ingredients inside coffee machine
    static int waterInCoffeeMachine = 400; // Amount in ml
    static int milkInCoffeeMachine = 540; // Amount in ml
    static int coffeeBeanInCoffeeMachine = 120; // Amount in grams
    static int disposableCups = 9;
    static int moneyInRegister = 550;
    static boolean serviceInProgress = true;

    static void printResources() {
        System.out.println(waterInCoffeeMachine + " of water");
        System.out.println(milkInCoffeeMachine + " of milk");
        System.out.println(coffeeBeanInCoffeeMachine + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(moneyInRegister + " of money");
    }

    static void buy(String i) {
        switch (i) {
            case "1":
                if (waterInCoffeeMachine < 250 || coffeeBeanInCoffeeMachine < 16 || disposableCups < 1) {
                    System.out.println("We are out of that coffee");
                    userService();
                } else {
                    waterInCoffeeMachine -= 250;
                    coffeeBeanInCoffeeMachine -= 16;
                    disposableCups -= 1;
                    moneyInRegister += 4;
                }
                break;
            case "2":
                if (waterInCoffeeMachine < 350 || milkInCoffeeMachine < 75 || coffeeBeanInCoffeeMachine < 20
                        || disposableCups < 1) {
                    System.out.println("We are out of that coffee");
                    userService();
                } else {
                    waterInCoffeeMachine -= 350;
                    milkInCoffeeMachine -= 75;
                    coffeeBeanInCoffeeMachine -= 20;
                    disposableCups -= 1;
                    moneyInRegister += 7;
                }
                break;
            case "3":
                if (waterInCoffeeMachine < 200 || milkInCoffeeMachine < 100 || coffeeBeanInCoffeeMachine < 12
                        || disposableCups < 1) {
                    System.out.println("We are out of that coffee");
                    userService();
                } else {
                    waterInCoffeeMachine -= 200;
                    milkInCoffeeMachine -= 100;
                    coffeeBeanInCoffeeMachine -= 12;
                    disposableCups -= 1;
                    moneyInRegister += 6;
                }
                break;
            default:
                userService();
        }
    }

    static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        waterInCoffeeMachine += scan.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkInCoffeeMachine += scan.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeanInCoffeeMachine += scan.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scan.nextInt();
    }

    static void userService() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String userServiceSelect = scan.next();

        switch (userServiceSelect) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back:");
                buy(scan.next());
                break;

            case "fill":
                fill();
                break;
            case "take":
                System.out.println("I gave you $" + moneyInRegister);
                moneyInRegister -= moneyInRegister;
                break;
            case "remaining":
                printResources();
                break;
            case "exit":
                serviceInProgress = false;
                break;
            default:
                userService();
        }
    }

    public static void main(String[] args) {
        while (serviceInProgress) {
            System.out.println();
            userService();
        }
        scan.close();
    }
}
