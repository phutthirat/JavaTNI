import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Enter word: ");
            String w = sc.next();
            if (w.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(w);
        }


        if (words.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(String.join(" ", words));
        }

        sc.close();
    }
}
