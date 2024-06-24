import javax.swing.JOptionPane;

public class CalculateSum {
    public static void main(String[] args) {
        String inputNum1, inputNum2;
        inputNum1 = JOptionPane.showInputDialog("Enter the first number: ");
        inputNum2 = JOptionPane.showInputDialog("Enter the second number: ");

        double addition = Double.parseDouble(inputNum1) + Double.parseDouble(inputNum2);
        double subtraction = Double.parseDouble(inputNum1) - Double.parseDouble(inputNum2);
        double multiplication = Double.parseDouble(inputNum1) * Double.parseDouble(inputNum2);
        double division = Double.parseDouble(inputNum1) / Double.parseDouble(inputNum2);

        JOptionPane.showMessageDialog(null,
                String.format("Addition = %f\nSubtraction = %f\nMultiplication = %f\nDivision = %f", addition, subtraction, multiplication, division));
        System.exit(0);
    }
}