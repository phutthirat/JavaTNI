import javax.swing.JOptionPane;

public class Lab505 {
    public static void main(String[] args) {
        Lab505 program = new Lab505();
        String inputWord = JOptionPane.showInputDialog(
                null,
                "Enter some word:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        if (inputWord == null || inputWord.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "No word entered.",
                    "Message",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        boolean isPalindrome = program.is_palindrome(inputWord);

        String resultMessage;

        if (isPalindrome) {
            resultMessage = inputWord + " is Palindrome";
        } else {
            resultMessage = inputWord + " is NOT Palindrome";
        }

        JOptionPane.showMessageDialog(
                null,
                resultMessage,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public boolean is_palindrome(String word) {
        String cleanedWord = word.toLowerCase();
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        if (cleanedWord.equals(reversedWord)) {
            return true;
        } else {
            return false;
        }
    }
}