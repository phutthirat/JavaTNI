import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {
        String inputPound = JOptionPane.showInputDialog("How many pounds do you want?");
        double pound = Double.parseDouble(inputPound);

        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        String message = JOptionPane.showInputDialog("Enter a message on cake:");

        BirthdayCake order = new BirthdayCake(message, pound, flavor, 400.0);

        int confirm;
        do {
            String orderDetails = order.toString() + "\n\nConfirm this order?";
            confirm = JOptionPane.showConfirmDialog(null, orderDetails, "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, order.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                String newMessage = JOptionPane.showInputDialog("Enter a new message for changing:");
                order.changeMessage(newMessage);
            }
        } while (confirm != JOptionPane.YES_OPTION);
    }
}
