import javax.swing.JOptionPane;

public class Lab403 {
    private static final String USERNAME_CONST = "admin";
    private static final String PASSWORD_CONST = "Admin1234";

    public static void main(String[] args) {
        while (true) {
            String username = JOptionPane.showInputDialog(null, "Enter username:");
            if (username == null) System.exit(0); // Cancel -> exit
            String password = JOptionPane.showInputDialog(null, "Enter password:");
            if (password == null) System.exit(0);

            // username: case-insensitive, password: case-sensitive
            if (USERNAME_CONST.equalsIgnoreCase(username.trim()) && PASSWORD_CONST.equals(password)) {
                JOptionPane.showMessageDialog(null, "Login Success!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login Fail...", "Incorrect username or password", JOptionPane.WARNING_MESSAGE);

            }
        }
    }
}
