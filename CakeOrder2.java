import java.util.Scanner;

public class CakeOrder2 {

    public static String selectFlavor() {
        Scanner sc = new Scanner(System.in);
        int choice;
        String flavor = "";

        while (true) {
            System.out.println("Press 1 for Chocolate");
            System.out.println("Press 2 for Vanilla");
            System.out.println("Press 3 for Strawberry");
            System.out.println("Press 4 for Lemon");
            System.out.println("Press 5 for Red Velvet");
            System.out.print("\nEnter a flavor number: ");
            choice = sc.nextInt();

            if (choice == 1) {
                flavor = "Chocolate";
                break;
            } else if (choice == 2) {
                flavor = "Vanilla";
                break;
            } else if (choice == 3) {
                flavor = "Strawberry";
                break;
            } else if (choice == 4) {
                flavor = "Lemon";
                break;
            } else if (choice == 5) {
                flavor = "Red Velvet";
                break;
            } else {
                System.out.println("Invalid flavor number. Please try again.\n");
            }
        }
        return flavor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.print("Enter an option: ");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            // birthdaycake
            String flavor = selectFlavor();
            System.out.print("Enter a message: ");
            String message = sc.nextLine();
            System.out.print("How many pounds: ");
            double pound = sc.nextDouble();

            BirthdayCake order = new BirthdayCake(message, pound, flavor, 350.0);
            System.out.println("\n" + order.toString());

        } else if (option == 2) {
            // cupcake
            String flavor = selectFlavor();
            System.out.print("How many pieces: ");
            int piece = sc.nextInt();

            CupCake order = new CupCake(piece, flavor, 70.0);
            System.out.println("\n" + order.toString());

        } else {
            System.out.println("\nWrong option!! Try again!!");
        }

        sc.close();
    }
}
