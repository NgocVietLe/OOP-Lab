import java.util.Scanner;

public class App {
    public static void main(String[] arguments) throws Exception {
        var inputScanner = new Scanner(System.in);
        var num = inputScanner.nextInt();
        inputScanner.close();
        for (int row = 0; row < num; row++) {
            String line = "";
            for (int spaces = num; spaces > row; spaces--) {
                line += " ";
            }
            for (int stars = 0; stars < row; stars++) {
                line += "*";
            }
            line += "*";
            for (int stars = 0; stars < row; stars++) {
                line += "*";
            }
            System.out.println(line);
        }
    }
}