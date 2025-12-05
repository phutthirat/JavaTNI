import java.util.Scanner;

public class Lab303 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for X coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = input.nextInt();

        String quadrantPosition;

        if (x == 0 && y == 0) {
            quadrantPosition = "Origin";
        }
        else if (x == 0 || y == 0) {
            if (x == 0) {
                quadrantPosition = "on the Y-axis";
            } else {
                quadrantPosition = "on the X-axis";
            }
        }
        else if (x > 0 && y > 0) {
            quadrantPosition = "First quadrant";
        }
        else if (x < 0 && y > 0) {
            quadrantPosition = "Second quadrant";
        }
        else if (x < 0 && y < 0) {
            quadrantPosition = "Third quadrant";
        }
        else { // x > 0 และ y < 0
            quadrantPosition = "Fourth quadrant";
        }

        String outputMessage;
        if (quadrantPosition.equals("Origin")) {
            outputMessage = String.format("The coordinate point (%d,%d) lies in the Origin", x, y);
        }
        else if (quadrantPosition.contains("quadrant")) {
            outputMessage = String.format("The coordinate point (%d,%d) lies in the %s", x, y, quadrantPosition);
        }
        else {
            outputMessage = String.format("The coordinate point (%d,%d) lies %s", x, y, quadrantPosition);
        }


        System.out.println(outputMessage);

        input.close();
    }
}

