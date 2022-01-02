package machine;

import java.util.Scanner;


public class CoffeeMachine {
    Scanner sc = new Scanner(System.in);
    int water;
    int milk;
    int bean;
    int disCup;
    int money;

    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.bean = 120;
        this.disCup = 9;
        this.money = 550;
    }

    public enum MachineState {
        BUY, FILL, TAKE, REMAINING, EXIT
    }

    void action() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String action = sc.nextLine();
        MachineState state = MachineState.valueOf(action.toUpperCase());

        switch (state) {
            case BUY:
                buy();
                action();
            case FILL:
                fill();
                action();
            case REMAINING:
                remaining();
                action();
            case TAKE:
                take();
                action();
            case EXIT:
                System.exit(0);
            default:
                System.out.println("Unknown input");
        }
    }

    void buy() {
        boolean instr = true;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        while (instr) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 4 && n > 0) {
                    // Cappuccino
                    if (n == 3) {
                        if (water < 200 || milk < 100 || bean < 12 || disCup < 1) {
                            System.out.printf("Sorry, not enough %s!\n", water < 200 ? "water" :
                                    milk < 100 ? "milk" :
                                            bean < 12 ? "beans" :
                                                    disCup == 0 ? "disposable cups" : "resources");
                        } else {
                            water -= 200;
                            milk -= 100;
                            bean -= 12;
                            disCup -= 1;
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                        }

                        // Latte
                    } else if (n == 2) {
                        if (water < 350 | milk < 75 | bean < 20 | disCup < 1) {
                            System.out.printf("Sorry, not enough %s!\n", water < 350 ? "water" :
                                    milk < 75 ? "milk" :
                                            bean <= 20 ? "beans" :
                                                    disCup == 0 ? "disposable cups" : "resources");

                        } else {
                            water -= 350;
                            milk -= 75;
                            bean -= 20;
                            disCup -= 1;
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                        }

                        // espresso
                    } else {
                        if (water < 250 | bean < 16 | disCup < 1) {
                            System.out.printf("Sorry not enough %s!\n", water < 250 ? "water" :
                                    bean < 16 ? "beans" :
                                            disCup == 0 ? "disposable cups" : "resources");
                        } else {
                            water -= 250;
                            bean -= 16;
                            disCup -= 1;
                            money += 4;
                            System.out.println("I have enough resources, making you a coffee!\n");
                        }
                    }
                    break;
                } else {
                    instr = false;
                    System.out.println("Wrong input");
                }
            } catch (Exception ex) {
                System.out.println("We don't have that power! You will be send back to menu");
                break;
            }
        }
    }

    void fill() {
        try {
            System.out.print("Write how many ml of water you want to add: \n ");
            water += Integer.parseInt(sc.nextLine());
            System.out.print("Write how many ml of milk you want to add: \n ");
            milk += Integer.parseInt(sc.nextLine());
            System.out.print("Write how many grams of coffee beans you want to add: \n ");
            bean += Integer.parseInt(sc.nextLine());
            System.out.print("Write how many disposable cups of coffee you want to add: \n ");
            disCup += Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Please enter only number!");
        }
    }

    void take() {
        System.out.printf("I gave you $%d\n", money);
        money -= money;
    }

    void remaining() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", water, milk, bean, disCup, money);
    }

    public static void main(String[] args) {
        CoffeeMachine machine1 = new CoffeeMachine();
        machine1.action();
    }
}

