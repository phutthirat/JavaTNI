import java.util.Scanner;

public class Lab503 {
    public static void main(String[] args) {
        Lab503 program = new Lab503();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");




        String message = scanner.nextLine();

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        System.out.println("\nList of vowel in \"" + message + "\"");


        for (char vowel : vowels) {
            int count = program.count_vowel(message, vowel);
            System.out.printf("The letter '%c' appears %d time(s).\n", vowel, count);
        }

        scanner.close();
    }


    public int count_vowel(String message, char letter) {
        int count = 0;

        String upperMessage = message.toUpperCase();
        char upperLetter = Character.toUpperCase(letter);

        for (int i = 0; i < upperMessage.length(); i++) {
            if (upperMessage.charAt(i) == upperLetter) {
                count++;
            }
        }


        return count;
    }
}