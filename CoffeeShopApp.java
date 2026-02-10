package CoffeeShop;

import java.util.Scanner;
import java.util.ArrayList;

public class CoffeeShopApp {
    private static Scanner sc = new Scanner(System.in);

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = sc.next();
        Espresso es = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String wantShot = sc.next();
        if (wantShot.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int numShots = sc.nextInt();
            es.addShot(numShots);
        }
        return es;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = sc.next();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String wantWhip = sc.next();
        boolean whipped = wantWhip.equalsIgnoreCase("y");

        return new Frappuccino(size, whipped);
    }

    public static void main(String[] args) {
        ArrayList<Drink> orders = new ArrayList<>();
        int countEspresso = 0;
        int countFrappuccino = 0;
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = sc.nextInt();

            if (option == 1) {
                Espresso e = orderEspresso();
                orders.add(e);
                countEspresso++;
                System.out.println(e.toString());
            } else if (option == 2) {
                Frappuccino f = orderFrappuccino();
                orders.add(f);
                countFrappuccino++;
                System.out.println(f.toString());
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            String more = sc.next();
            if (!more.equalsIgnoreCase("y")) {
                continueOrdering = false;
            }
            System.out.println();
        }

        double grandTotal = 0;
        for (Drink d : orders) {
            grandTotal += d.calculateFinalPrice();
        }

        System.out.println("You ordered " + countEspresso + " Espresso");
        System.out.println("You ordered " + countFrappuccino + " Frappuccino");
        System.out.println("Total Price = " + grandTotal);
    }
}