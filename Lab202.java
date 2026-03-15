
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        DecimalFormat frm = new DecimalFormat("#.#");

        System.out.println("Summation =" + frm.format(number1+number2) );
        System.out.println("Subtraction =" + frm.format(number1-number2) );
        System.out.println("Multiplication =" + frm.format(number1*number2) );
        System.out.println("Division =" + frm.format(number1/number2) );
        System.out.println("Modulus =" + frm.format(number1%number2) );
    }
}
