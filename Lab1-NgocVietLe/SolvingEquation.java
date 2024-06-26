import javax.swing.JOptionPane;

public class SolvingEquation {
    public static void main(String[] args) {
        String[] equationTypes = { "Linear with one variable", "Quadratic with one variable", "Linear with two variables" };

        Object selectedType = JOptionPane.showInputDialog(null, "Which type of equations do you want to solve?", "Selection",
                JOptionPane.DEFAULT_OPTION, null, equationTypes, "0");
        if (selectedType != null) {
            String selectedString = selectedType.toString();
            switch (selectedString) {
                case "Linear with one variable":
                    solveLinearOneVar();
                    break;
                case "Quadratic with one variable":
                    solveQuadraticOneVar();
                    break;
                case "Linear with two variables":
                    solveLinearTwoVar();
                    break;
                default:
                    break;
            }
            System.exit(0);
        } else {
            System.out.println("User cancelled");
            System.exit(0);
        }
    }

    public static void solveLinearOneVar() {
        String coefficientA = JOptionPane.showInputDialog("Enter coefficient a: ");
        String coefficientB = JOptionPane.showInputDialog("Enter coefficient b: ");
        if (Integer.parseInt(coefficientA) == 0) {
            if (Integer.parseInt(coefficientB) == 0) {
                JOptionPane.showMessageDialog(null, "x = 0", "Result", 0);
            } else {
                JOptionPane.showMessageDialog(null, "x = " + coefficientB, "Result", 0);
            }
        } else {
            Double result = -Double.parseDouble(coefficientB) / Double.parseDouble(coefficientA);
            JOptionPane.showMessageDialog(null, "x = " + result, "Result", 0);
        }
        System.exit(0);
    }

    public static void solveQuadraticOneVar() {
        Double coefficientA = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a: "));
        Double coefficientB = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b: "));
        Double coefficientC = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient c: "));
        Double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
        if (discriminant > 0) {
            Double root1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            Double root2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            JOptionPane.showMessageDialog(null, String.format("Root 1 = %.3f\nRoot 2 = %.3f", root1, root2), "Result", 2);
        } else if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "No Real Roots", "Result", 0);
        } else {
            Double root = -coefficientB / (2 * coefficientA);
            JOptionPane.showMessageDialog(null, "Root = " + root, "Result", 1);
        }
        System.exit(0);
    }

    public static void solveLinearTwoVar() {
        Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a11: "));
        Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a12: "));
        Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a21: "));
    }
}