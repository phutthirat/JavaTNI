import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Order 1
        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String bMsg = sc.nextLine();
        System.out.print("Enter a flavor : ");
        String bFlavor = sc.nextLine();
        System.out.print("How many pound  : ");
        double bPound = sc.nextDouble();

        BirthdayCake order1 = new BirthdayCake(bMsg, bPound, bFlavor, 350.0);
        System.out.println(order1.toString());
        System.out.println();

        // Order 2
        sc.nextLine();
        System.out.println("Cup Cake's Details:");
        System.out.print("Enter a flavor : ");
        String cFlavor = sc.nextLine();
        System.out.print("How many piece : ");
        int cPiece = sc.nextInt();

        CupCake order2 = new CupCake(cPiece, cFlavor, 65.0);
        System.out.println(order2.toString());
        System.out.println();

        // Order 3
        sc.nextLine(); // clear buffer
        System.out.println("Eclairs Details:");
        System.out.print("Enter filling (Vanilla, Matcha, Thai Tea): ");
        String eFilling = sc.nextLine();
        System.out.print("Enter a flavor : ");
        String eFlavor = sc.nextLine();
        System.out.print("How many pieces: ");
        int eAmount = sc.nextInt();

        Eclairs order3 = new Eclairs(eFilling, eAmount, eFlavor, 15.0);
        System.out.println(order3.toString());

        double totalAll = order1.calculateTotalPrice() + order2.calculateTotalPrice()+
                order3.calculateTotalPrice();
        System.out.println("Total price = " + totalAll);

        sc.close();
    }
}
