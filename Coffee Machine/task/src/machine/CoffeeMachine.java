package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ### 1 ###
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        // ### 2 ###
        int waterPerCup = 200; // ml
        int milkPerCup = 50; // ml
        int beansPerCup = 15; // g

//        int cupsOfCoffee = scanner.nextInt();
//
//        int waterOnCups = waterPerCup * cupsOfCoffee;
//        int milkOnCups = milkPerCup * cupsOfCoffee;
//        int beansOnCups = beansPerCup * cupsOfCoffee;
//
//        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
//        System.out.println(waterOnCups + " ml of water");
//        System.out.println(milkOnCups + " ml of milk");
//        System.out.println(beansOnCups + "  g of coffee beans");

        // ### 3 ###
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterMachineHas = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkMachineHas = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansMachineHas = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int howManyCupsNeed = scanner.nextInt();

        int canMakeCupsFromWater = waterMachineHas / waterPerCup;
        int canMakeCupsFromMilk = milkMachineHas / milkPerCup;
        int canMakeCupsFromBeans = beansMachineHas / beansPerCup;

        int canMakeCupsOfCoffee = min(canMakeCupsFromWater, canMakeCupsFromMilk, canMakeCupsFromBeans);

        if (canMakeCupsOfCoffee < howManyCupsNeed) {
            System.out.println("No, I can make only " + canMakeCupsOfCoffee + " cup(s) of coffee");
        } else if (canMakeCupsOfCoffee == howManyCupsNeed) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (canMakeCupsOfCoffee > howManyCupsNeed) {
            int evenMoreCups = canMakeCupsOfCoffee - howManyCupsNeed;
            System.out.println("Yes, I can make that amount of coffee (and even " + evenMoreCups + " more than that)");
        }
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
}
}
