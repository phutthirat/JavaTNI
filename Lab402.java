import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
        String studentId = null;
        while (true) {
            studentId = JOptionPane.showInputDialog(null, "Enter student-id:");
            if (studentId == null) {
                System.exit(0);
            }
            studentId = studentId.trim();
            if (studentId.length() == 10) {
                break;
            } else {

                JOptionPane.showMessageDialog(null, "Student id must be 10 digits. Please try again.");
            }
        }


        String code = studentId.substring(2, 5);
        String major;
        switch (code) {
            case "131":
                major = "Information Technology (IT)";
                break;
            case "132":
                major = "Multimedia Technology (MT)";
                break;
            case "133":
                major = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                major = "Data Science and Data Analytics (DS)";
                break;
            default:
                major = "Cannot found major";
                break;
        }

        String message = "Student ID: " + studentId + "\n" + "Major: " + major;
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
