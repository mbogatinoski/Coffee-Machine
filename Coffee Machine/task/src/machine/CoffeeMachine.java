package machine;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int cbeans = 120;
    static int cups = 9;
    static int cash = 550;

    public static void displayIngredients() {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                cbeans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + cash + " of money");
    }

    public static void buy(String type) {
        if (Objects.equals(type, "1")) {
            water -= 250;
            cbeans -= 16;
            cups -= 1;
            cash += 4;
        } else if (Objects.equals(type, "2")) {
            water -= 350;
            milk -= 75;
            cbeans -= 20;
            cups -= 1;
            cash += 7;
        } else {
            water -= 200;
            milk -= 100;
            cbeans -= 12;
            cups -= 1;
            cash += 6;
        }
    }

    public static void fill(int fwater, int fmilk, int fcbeans, int fcups) {
        water += fwater;
        milk += fmilk;
        cbeans += fcbeans;
        cups += fcups;
    }

    public static void take() {
        System.out.println("I gave you $" + cash);
        cash = 0;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        loop: while (true) {
            System.out.println("Write action (buy, fill, take,remaining, exit): ");
            String action = scan.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choice = scan.nextLine();
                    if (Objects.equals(choice, "1")) {
                        if (water >= 250 && cbeans >= 16 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(choice);
                        } else if (water < 250){
                            System.out.println("Sorry, not enough water!");
                        } else if (cbeans < 16){
                            System.out.println("Sorry, not enough coffee beans!");
                        } else {
                            System.out.println("Sorry, not enough cups!");
                        }
                    } else if (Objects.equals(choice, "2")) {
                        if (water >= 350 && milk >= 75 && cbeans >= 20 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(choice);
                        } else if (water < 350){
                            System.out.println("Sorry, not enough water!");
                        } else if (cbeans < 20){
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else {
                            System.out.println("Sorry, not enough cups!");
                        }
                    } else if (Objects.equals(choice, "3")) {
                        if (water >= 200 && milk >= 100 && cbeans >= 12 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            buy(choice);
                        } else if (water < 200){
                            System.out.println("Sorry, not enough water!");
                        } else if (cbeans < 12){
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else {
                            System.out.println("Sorry, not enough cups!");
                        }
                    } else if (Objects.equals(choice, "back")) {
                        break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int fwater = scan.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int fmilk = scan.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int fcbeans = scan.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int fcups = scan.nextInt();
                    fill(fwater, fmilk, fcbeans, fcups);
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    displayIngredients();
                    break;
                case "exit":
                    break loop;
            }
        }
    }
}
