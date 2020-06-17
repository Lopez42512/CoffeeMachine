import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int waterForOneCupOfCoffee = 200;
        int milkForOneCupOfCoffee = 50;
        int coffeeBeanForOneCupOfCoffee = 15;
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scan.nextInt();
        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
        System.out.println(waterForOneCupOfCoffee * cupsOfCoffee + " ml of water");
        System.out.println(milkForOneCupOfCoffee * cupsOfCoffee + " ml of milk");
        System.out.println(coffeeBeanForOneCupOfCoffee * cupsOfCoffee + " g of coffee beans");
        scan.close();
    }
}