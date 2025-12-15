import javax.swing.JOptionPane;

public class Lab501 {


    public double cal_bmi(double weight, double height_cm) {
        double height_m = height_cm / 100.0;
        return weight / (height_m * height_m);

    }

    public String check_bmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy Weight";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else { // 30.0 ขึ้นไป
            return "Obese";
        }
    }


    public static void main(String[] args) {
        Lab501 program = new Lab501();

        while (true) {
            int confirmResult = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your BMI?",
                    "Check BMI",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirmResult == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "END PROGRAM!!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
            else if (confirmResult == JOptionPane.YES_OPTION) {
                try {
                    String weightInput = JOptionPane.showInputDialog(
                            null,
                            "Enter your weight (kg.):",
                            "Input",
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (weightInput == null) {
                        continue;
                    }
                    double weight = Double.parseDouble(weightInput);

                    String heightInput = JOptionPane.showInputDialog(
                            null,
                            "Enter your height (cm.):",
                            "Input",
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (heightInput == null) {
                        continue;
                    }
                    double height_cm = Double.parseDouble(heightInput);

                    double bmi = program.cal_bmi(weight, height_cm);
                    String bmiResult = program.check_bmi(bmi);

                    String formattedBmi = String.format("%.2f", bmi);

                    String outputMessage = "Your BMI = " + formattedBmi + "\n"
                            + "Your BMI result = " + bmiResult;

                    JOptionPane.showMessageDialog(
                            null,
                            outputMessage,
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid input! Please enter a valid number.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {


                break;
            }
        }
    }
}