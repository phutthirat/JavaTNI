import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour,minute;
        System.out.print("Input hour : ");
        hour  = scanner.nextInt();
        System.out.print("Input minute : ");
        minute  = scanner.nextInt();
        int total_minute = (hour*60)+minute;
        System.out.print("Total time is " + total_minute + "minute");

    }
}
