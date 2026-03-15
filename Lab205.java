import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {

        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int hour = minute/60;
        int total_minute = minute%60;
        JOptionPane.showMessageDialog(null,minute + "minutes is " + hour + "hour" + total_minute +"minute","Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
