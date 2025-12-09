import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = sc.nextLine();
            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.println("The sentence must end with full stop point: " + sentence);
            }
        }


        System.out.println(sentence);


        String[] tokens = sentence.split("\\s+");
        for (String t : tokens) {
            System.out.println(t);
        }

        sc.close();
    }
}
