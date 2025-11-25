import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#.00");
        String numberOfCustomerInput = JOptionPane.showInputDialog(null,
                "How many customer",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        int Customer = Integer.parseInt(numberOfCustomerInput);

        double priceWithNET = (299*Customer)*1.07;
        String discountInput = JOptionPane.showInputDialog(null,
                "Price with NET is " + frm.format(priceWithNET) + " baht." +
                        "\nHow much of discount(%) on your coupon?",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        int discount = Integer.parseInt(discountInput);
        double total_Price = priceWithNET-(priceWithNET*discount/100);
        String customerPaidInput = JOptionPane.showInputDialog(null,
                "Total price is " + frm.format(total_Price) + " baht." +
                        "\nEnter the amount the customer paid:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        double customerPaid = Double.parseDouble(customerPaidInput);
        double change = customerPaid-total_Price;
        JOptionPane.showMessageDialog(null,
                "Total price is " + frm.format(total_Price) + " baht." +
                        "\nCustomer paid " + frm.format(customerPaid) + " baht." +
                        "\n Get change " + frm.format(change) + " baht.");

    }
}
