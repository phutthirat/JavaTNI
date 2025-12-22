import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String evenList = "";
        String oddList = "";

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            while (num <= 0) {
                System.out.print("The number must be positive! Enter number again: ");
                num = sc.nextInt();
            }

            if (num % 2 == 0) {
                evenList += num + " ";
            } else {
                oddList += num + " ";
            }
        }

        System.out.println("\nList of even number: " + evenList);
        System.out.println("List of odd  number: " + oddList);
    }
}