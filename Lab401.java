import javax.swing.JOptionPane;

public class Lab401 {
    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Enter your full name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                return;
            }

            input = input.trim();

            String[] parts = input.split("\\s+");

            if (parts.length <= 2) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid format.\nPlease enter exactly three words: [first] [middle] [last].",
                        "Message",
                        JOptionPane.WARNING_MESSAGE
                );
                continue; // ask again
            }

            String first  = formatFirst(parts[0]);
            String middle = parts[1].toUpperCase();
            String last   = parts[2].toUpperCase();


            JOptionPane.showMessageDialog(
                    null,
                    "Welcome, " + first + " " + middle + " " + last,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
            break;
        }
    }

    public static String formatFirst(String name) {
        if (name == null || name.isEmpty()) return "";
        String lower = name.toLowerCase();
        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }
}
